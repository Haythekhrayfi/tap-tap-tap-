package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.util.AggregationType;
import java.util.Stack;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes.dex */
public class NestedBasicPropertyIA extends ImplicitAction {
    public Stack<s2.a> actionDataStack = new Stack<>();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3694a;

        static {
            int[] iArr = new int[AggregationType.values().length];
            f3694a = iArr;
            try {
                iArr[AggregationType.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3694a[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3694a[AggregationType.AS_COMPLEX_PROPERTY_COLLECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3694a[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3694a[AggregationType.AS_BASIC_PROPERTY_COLLECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void body(InterpretationContext interpretationContext, String str) {
        String strSubst = interpretationContext.subst(str);
        s2.a aVarPeek = this.actionDataStack.peek();
        int i10 = a.f3694a[aVarPeek.f35401b.ordinal()];
        if (i10 == 4) {
            aVarPeek.f35400a.setProperty(aVarPeek.f35402c, strSubst);
        } else {
            if (i10 == 5) {
                aVarPeek.f35400a.addBasicProperty(aVarPeek.f35402c, strSubst);
                return;
            }
            StringBuilder sbA = defpackage.a.a("Unexpected aggregationType ");
            sbA.append(aVarPeek.f35401b);
            addError(sbA.toString());
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        this.actionDataStack.pop();
    }

    @Override // ch.qos.logback.core.joran.action.ImplicitAction
    public boolean isApplicable(ElementPath elementPath, Attributes attributes, InterpretationContext interpretationContext) {
        String strPeekLast = elementPath.peekLast();
        if (interpretationContext.isEmpty()) {
            return false;
        }
        PropertySetter propertySetter = new PropertySetter(interpretationContext.peekObject());
        propertySetter.setContext(this.context);
        AggregationType aggregationTypeComputeAggregationType = propertySetter.computeAggregationType(strPeekLast);
        int i10 = a.f3694a[aggregationTypeComputeAggregationType.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4 || i10 == 5) {
            this.actionDataStack.push(new s2.a(propertySetter, aggregationTypeComputeAggregationType, strPeekLast));
            return true;
        }
        addError("PropertySetter.canContainComponent returned " + aggregationTypeComputeAggregationType);
        return false;
    }
}
