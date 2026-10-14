package s;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f35387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35389f;

    public b(String str, int i10) {
        this.f35386c = Integer.MIN_VALUE;
        this.f35387d = Float.NaN;
        this.f35388e = null;
        this.f35384a = str;
        this.f35385b = i10;
    }

    public b(String str, int i10, float f10) {
        this.f35386c = Integer.MIN_VALUE;
        this.f35387d = Float.NaN;
        this.f35388e = null;
        this.f35384a = str;
        this.f35385b = i10;
        this.f35387d = f10;
    }

    public b(String str, int i10, int i11) {
        this.f35386c = Integer.MIN_VALUE;
        this.f35387d = Float.NaN;
        this.f35388e = null;
        this.f35384a = str;
        this.f35385b = i10;
        if (i10 == 901) {
            this.f35387d = i11;
        } else {
            this.f35386c = i11;
        }
    }

    public b(String str, int i10, Object obj) {
        this.f35386c = Integer.MIN_VALUE;
        this.f35387d = Float.NaN;
        this.f35388e = null;
        this.f35384a = str;
        this.f35385b = i10;
        a(obj);
    }

    public b(String str, int i10, String str2) {
        this.f35386c = Integer.MIN_VALUE;
        this.f35387d = Float.NaN;
        this.f35388e = null;
        this.f35384a = str;
        this.f35385b = i10;
        this.f35388e = str2;
    }

    public b(String str, int i10, boolean z10) {
        this.f35386c = Integer.MIN_VALUE;
        this.f35387d = Float.NaN;
        this.f35388e = null;
        this.f35384a = str;
        this.f35385b = i10;
        this.f35389f = z10;
    }

    public b(b bVar) {
        this.f35386c = Integer.MIN_VALUE;
        this.f35387d = Float.NaN;
        this.f35388e = null;
        this.f35384a = bVar.f35384a;
        this.f35385b = bVar.f35385b;
        this.f35386c = bVar.f35386c;
        this.f35387d = bVar.f35387d;
        this.f35388e = bVar.f35388e;
        this.f35389f = bVar.f35389f;
    }

    public b(b bVar, Object obj) {
        this.f35386c = Integer.MIN_VALUE;
        this.f35387d = Float.NaN;
        this.f35388e = null;
        this.f35384a = bVar.f35384a;
        this.f35385b = bVar.f35385b;
        a(obj);
    }

    public void a(Object obj) {
        switch (this.f35385b) {
            case 900:
            case 902:
            case 906:
                this.f35386c = ((Integer) obj).intValue();
                break;
            case 901:
            case 905:
                this.f35387d = ((Float) obj).floatValue();
                break;
            case 903:
                this.f35388e = (String) obj;
                break;
            case 904:
                this.f35389f = ((Boolean) obj).booleanValue();
                break;
        }
    }

    public String toString() {
        StringBuilder sbA;
        StringBuilder sb2;
        String string;
        String strA = a.a(new StringBuilder(), this.f35384a, CoreConstants.COLON_CHAR);
        switch (this.f35385b) {
            case 900:
                sbA = defpackage.a.a(strA);
                sbA.append(this.f35386c);
                break;
            case 901:
                sb2 = new StringBuilder();
                sb2.append(strA);
                sb2.append(this.f35387d);
                sbA = sb2;
                break;
            case 902:
                sbA = defpackage.a.a(strA);
                int i10 = this.f35386c;
                StringBuilder sbA2 = defpackage.a.a("00000000");
                sbA2.append(Integer.toHexString(i10));
                String string2 = sbA2.toString();
                StringBuilder sbA3 = defpackage.a.a("#");
                sbA3.append(string2.substring(string2.length() - 8));
                string = sbA3.toString();
                sbA.append(string);
                break;
            case 903:
                sbA = defpackage.a.a(strA);
                string = this.f35388e;
                sbA.append(string);
                break;
            case 904:
                sbA = defpackage.a.a(strA);
                sbA.append(Boolean.valueOf(this.f35389f));
                break;
            case 905:
                sb2 = new StringBuilder();
                sb2.append(strA);
                sb2.append(this.f35387d);
                sbA = sb2;
                break;
            default:
                sbA = defpackage.a.a(strA);
                string = "????";
                sbA.append(string);
                break;
        }
        return sbA.toString();
    }
}
