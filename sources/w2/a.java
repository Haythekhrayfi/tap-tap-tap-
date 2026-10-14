package w2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class a implements e<Date> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f37082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f37083b;

    public a(FileNamePattern fileNamePattern) {
        DateTokenConverter<Object> primaryDateTokenConverter = fileNamePattern.getPrimaryDateTokenConverter();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(primaryDateTokenConverter != null ? primaryDateTokenConverter.getDatePattern() : "yyyy-MM-dd", Locale.US);
        TimeZone timeZone = primaryDateTokenConverter != null ? primaryDateTokenConverter.getTimeZone() : TimeZone.getDefault();
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        this.f37082a = simpleDateFormat;
        this.f37083b = Pattern.compile(fileNamePattern.toRegex(true, false));
    }

    @Override // w2.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Date a(String str) {
        try {
            Matcher matcher = this.f37083b.matcher(str);
            return this.f37082a.parse((!matcher.find() || matcher.groupCount() < 1) ? "" : matcher.group(1));
        } catch (ParseException unused) {
            return null;
        }
    }
}
