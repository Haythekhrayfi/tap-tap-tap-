package n0;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f33575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f33576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f33577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f33578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f33579h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f33582c;

    public static class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte[] f33586e = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f33587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f33588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public char f33590d;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f33586e[i10] = Character.getDirectionality(i10);
            }
        }

        public b(CharSequence charSequence, boolean z10) {
            this.f33587a = charSequence;
            this.f33588b = charSequence.length();
        }

        public byte a() {
            char cCharAt = this.f33587a.charAt(this.f33589c - 1);
            this.f33590d = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f33587a, this.f33589c);
                this.f33589c -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f33589c--;
            char c10 = this.f33590d;
            return c10 < 1792 ? f33586e[c10] : Character.getDirectionality(c10);
        }
    }

    static {
        e eVar = f.f33601c;
        f33575d = eVar;
        f33576e = Character.toString((char) 8206);
        f33577f = Character.toString((char) 8207);
        f33578g = new a(false, 2, eVar);
        f33579h = new a(true, 2, eVar);
    }

    public a(boolean z10, int i10, e eVar) {
        this.f33580a = z10;
        this.f33581b = i10;
        this.f33582c = eVar;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        b bVar = new b(charSequence, false);
        bVar.f33589c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = bVar.f33589c;
            if (i13 < bVar.f33588b && i10 == 0) {
                char cCharAt = bVar.f33587a.charAt(i13);
                bVar.f33590d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(bVar.f33587a, bVar.f33589c);
                    bVar.f33589c = Character.charCount(iCodePointAt) + bVar.f33589c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    bVar.f33589c++;
                    char c10 = bVar.f33590d;
                    directionality = c10 < 1792 ? b.f33586e[c10] : Character.getDirectionality(c10);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
        }
        if (i10 == 0) {
            return 0;
        }
        if (i11 != 0) {
            return i11;
        }
        while (bVar.f33589c > 0) {
            switch (bVar.a()) {
                case 14:
                case 15:
                    if (i10 == i12) {
                        return -1;
                    }
                    i12--;
                    break;
                case 16:
                case 17:
                    if (i10 == i12) {
                        return 1;
                    }
                    i12--;
                    break;
                case 18:
                    i12++;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        b bVar = new b(charSequence, false);
        bVar.f33589c = bVar.f33588b;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            while (bVar.f33589c > 0) {
                byte bA = bVar.a();
                if (bA == 0) {
                    if (i11 == 0) {
                        return -1;
                    }
                    if (i10 == 0) {
                        i10 = i11;
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i11 == 0) {
                        return 1;
                    }
                    if (i10 == 0) {
                        i10 = i11;
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i10 == i11) {
                                return -1;
                            }
                            i11--;
                            break;
                        case 16:
                        case 17:
                            if (i10 == i11) {
                                return 1;
                            }
                            i11--;
                            break;
                        case 18:
                            i11++;
                            break;
                        default:
                            if (i10 == 0) {
                                i10 = i11;
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public static a c() {
        C0366a c0366a = new C0366a();
        int i10 = c0366a.f33584b;
        if (i10 == 2 && c0366a.f33585c == f33575d) {
            return c0366a.f33583a ? f33579h : f33578g;
        }
        return new a(c0366a.f33583a, i10, c0366a.f33585c);
    }

    public CharSequence d(CharSequence charSequence, e eVar, boolean z10) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zB = ((f.c) eVar).b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = "";
        if (((this.f33581b & 2) != 0) && z10) {
            boolean zB2 = ((f.c) (zB ? f.f33600b : f.f33599a)).b(charSequence, 0, charSequence.length());
            if (this.f33580a || !(zB2 || a(charSequence) == 1)) {
                str = (!this.f33580a || (zB2 && a(charSequence) != -1)) ? "" : f33577f;
            } else {
                str = f33576e;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zB != this.f33580a) {
            spannableStringBuilder.append(zB ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            boolean zB3 = ((f.c) (zB ? f.f33600b : f.f33599a)).b(charSequence, 0, charSequence.length());
            if (!this.f33580a && (zB3 || b(charSequence) == 1)) {
                str2 = f33576e;
            } else if (this.f33580a && (!zB3 || b(charSequence) == -1)) {
                str2 = f33577f;
            }
            spannableStringBuilder.append((CharSequence) str2);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: n0.a$a, reason: collision with other inner class name */
    public static final class C0366a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f33583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f33584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f33585c;

        public C0366a() {
            Locale locale = Locale.getDefault();
            e eVar = a.f33575d;
            int i10 = g.f33606a;
            a(g.a.a(locale) == 1);
        }

        public final void a(boolean z10) {
            this.f33583a = z10;
            this.f33585c = a.f33575d;
            this.f33584b = 2;
        }

        public C0366a(Locale locale) {
            e eVar = a.f33575d;
            int i10 = g.f33606a;
            a(g.a.a(locale) == 1);
        }

        public C0366a(boolean z10) {
            this.f33583a = z10;
            this.f33585c = a.f33575d;
            this.f33584b = 2;
        }
    }
}
