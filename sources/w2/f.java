package w2;

import ch.qos.logback.core.rolling.helper.FileNamePattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class f implements e<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f37086a;

    public f(FileNamePattern fileNamePattern) {
        this.f37086a = Pattern.compile(fileNamePattern.toRegex(false, true).replace("(?:\ufffe)?", "").replace("(?:\uffff)?", ""));
    }

    @Override // w2.e
    public Comparable a(String str) {
        int i10 = -1;
        try {
            Matcher matcher = this.f37086a.matcher(str);
            return Integer.valueOf(Integer.parseInt((!matcher.find() || matcher.groupCount() < 1) ? "" : matcher.group(1), 10));
        } catch (NumberFormatException unused) {
            return i10;
        }
    }
}
