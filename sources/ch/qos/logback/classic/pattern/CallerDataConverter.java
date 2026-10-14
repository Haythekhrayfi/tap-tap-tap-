package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.status.ErrorStatus;
import defpackage.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class CallerDataConverter extends ClassicConverter {
    public static final String DEFAULT_CALLER_LINE_PREFIX = "Caller+";
    public static final String DEFAULT_RANGE_DELIMITER = "..";
    private int depthStart = 0;
    private int depthEnd = 5;
    public List<EventEvaluator<ILoggingEvent>> evaluatorList = null;
    public final int MAX_ERROR_COUNT = 4;
    public int errorCount = 0;

    private void addEvaluator(EventEvaluator<ILoggingEvent> eventEvaluator) {
        if (this.evaluatorList == null) {
            this.evaluatorList = new ArrayList();
        }
        this.evaluatorList.add(eventEvaluator);
    }

    private void checkRange() {
        StringBuilder sbA;
        String str;
        int i10;
        int i11 = this.depthStart;
        if (i11 < 0 || (i10 = this.depthEnd) < 0) {
            sbA = a.a("Invalid depthStart/depthEnd range [");
            sbA.append(this.depthStart);
            sbA.append(", ");
            sbA.append(this.depthEnd);
            str = "] (negative values are not allowed)";
        } else {
            if (i11 < i10) {
                return;
            }
            sbA = a.a("Invalid depthEnd range [");
            sbA.append(this.depthStart);
            sbA.append(", ");
            sbA.append(this.depthEnd);
            str = "] (start greater or equal to end)";
        }
        sbA.append(str);
        addError(sbA.toString());
    }

    private boolean isRange(String str) {
        return str.contains(getDefaultRangeDelimiter());
    }

    private String[] splitRange(String str) {
        return str.split(Pattern.quote(getDefaultRangeDelimiter()), 2);
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        StringBuilder sb2 = new StringBuilder();
        if (this.evaluatorList != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.evaluatorList.size(); i10++) {
                EventEvaluator<ILoggingEvent> eventEvaluator = this.evaluatorList.get(i10);
                try {
                    if (eventEvaluator.evaluate(iLoggingEvent)) {
                        z10 = true;
                        break;
                    }
                } catch (EvaluationException e10) {
                    this.errorCount++;
                    if (this.errorCount < 4) {
                        StringBuilder sbA = a.a("Exception thrown for evaluator named [");
                        sbA.append(eventEvaluator.getName());
                        sbA.append("]");
                        addError(sbA.toString(), e10);
                    } else if (this.errorCount == 4) {
                        StringBuilder sbA2 = a.a("Exception thrown for evaluator named [");
                        sbA2.append(eventEvaluator.getName());
                        sbA2.append("].");
                        ErrorStatus errorStatus = new ErrorStatus(sbA2.toString(), this, e10);
                        errorStatus.add(new ErrorStatus("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        addStatus(errorStatus);
                    }
                }
            }
            if (!z10) {
                return "";
            }
        }
        StackTraceElement[] callerData = iLoggingEvent.getCallerData();
        if (callerData != null) {
            int length = callerData.length;
            int i11 = this.depthStart;
            if (length > i11) {
                int length2 = this.depthEnd;
                if (length2 >= callerData.length) {
                    length2 = callerData.length;
                }
                while (i11 < length2) {
                    sb2.append(getCallerLinePrefix());
                    sb2.append(i11);
                    sb2.append("\t at ");
                    sb2.append(callerData[i11]);
                    sb2.append(CoreConstants.LINE_SEPARATOR);
                    i11++;
                }
                return sb2.toString();
            }
        }
        return CallerData.CALLER_DATA_NA;
    }

    public String getCallerLinePrefix() {
        return DEFAULT_CALLER_LINE_PREFIX;
    }

    public String getDefaultRangeDelimiter() {
        return DEFAULT_RANGE_DELIMITER;
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        EventEvaluator<ILoggingEvent> eventEvaluator;
        String firstOption = getFirstOption();
        if (firstOption == null) {
            return;
        }
        try {
            if (isRange(firstOption)) {
                String[] strArrSplitRange = splitRange(firstOption);
                if (strArrSplitRange.length == 2) {
                    this.depthStart = Integer.parseInt(strArrSplitRange[0]);
                    this.depthEnd = Integer.parseInt(strArrSplitRange[1]);
                    checkRange();
                } else {
                    addError("Failed to parse depth option as range [" + firstOption + "]");
                }
            } else {
                this.depthEnd = Integer.parseInt(firstOption);
            }
        } catch (NumberFormatException e10) {
            addError("Failed to parse depth option [" + firstOption + "]", e10);
        }
        List<String> optionList = getOptionList();
        if (optionList == null || optionList.size() <= 1) {
            return;
        }
        int size = optionList.size();
        for (int i10 = 1; i10 < size; i10++) {
            String str = optionList.get(i10);
            Context context = getContext();
            if (context != null && (eventEvaluator = (EventEvaluator) ((Map) context.getObject(CoreConstants.EVALUATOR_MAP)).get(str)) != null) {
                addEvaluator(eventEvaluator);
            }
        }
    }
}
