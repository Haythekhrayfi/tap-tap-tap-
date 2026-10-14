package l0;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f32092b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f32093a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Locale[] f32094a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale) {
            for (Locale locale2 : f32094a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String strA = n0.c.a(locale);
            if (!strA.isEmpty()) {
                return strA.equals(n0.c.a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public f(g gVar) {
        this.f32093a = gVar;
    }

    public static f a(Locale... localeArr) {
        return g(b.a(localeArr));
    }

    public static f b(String str) {
        if (str == null || str.isEmpty()) {
            return f32092b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    public static f g(LocaleList localeList) {
        return new f(new h(localeList));
    }

    public Locale c(int i10) {
        return this.f32093a.get(i10);
    }

    public boolean d() {
        return this.f32093a.isEmpty();
    }

    public int e() {
        return this.f32093a.size();
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f32093a.equals(((f) obj).f32093a);
    }

    public String f() {
        return this.f32093a.a();
    }

    public int hashCode() {
        return this.f32093a.hashCode();
    }

    public String toString() {
        return this.f32093a.toString();
    }
}
