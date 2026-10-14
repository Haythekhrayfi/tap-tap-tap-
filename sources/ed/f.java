package ed;

import fd.j0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29152d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Pattern f29153c;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(String str) {
        j0.i(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        j0.h(patternCompile, "compile(pattern)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(String str, g gVar) {
        j0.i(str, "pattern");
        j0.i(gVar, "option");
        a aVar = f29152d;
        int value = gVar.getValue();
        Objects.requireNonNull(aVar);
        Pattern patternCompile = Pattern.compile(str, (value & 2) != 0 ? value | 64 : value);
        j0.h(patternCompile, "compile(pattern, ensureUnicodeCase(option.value))");
        this(patternCompile);
    }

    public f(Pattern pattern) {
        j0.i(pattern, "nativePattern");
        this.f29153c = pattern;
    }

    public final boolean a(CharSequence charSequence) {
        j0.i(charSequence, "input");
        return this.f29153c.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        j0.i(charSequence, "input");
        String strReplaceAll = this.f29153c.matcher(charSequence).replaceAll(str);
        j0.h(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return strReplaceAll;
    }

    public String toString() {
        String string = this.f29153c.toString();
        j0.h(string, "nativePattern.toString()");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(String str, Set<? extends g> set) {
        j0.i(str, "pattern");
        j0.i(set, "options");
        a aVar = f29152d;
        Iterator<T> it = set.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= ((e) it.next()).getValue();
        }
        Objects.requireNonNull(aVar);
        Pattern patternCompile = Pattern.compile(str, (value & 2) != 0 ? value | 64 : value);
        j0.h(patternCompile, "compile(pattern, ensureU…odeCase(options.toInt()))");
        this(patternCompile);
    }
}
