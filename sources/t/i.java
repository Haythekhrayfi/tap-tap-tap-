package t;

/* JADX INFO: loaded from: classes.dex */
public class i extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f35606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f35607e;

    public i(String str) {
        this.f35566a = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f35606d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i10 = iIndexOf2 + 1;
        this.f35607e = Double.parseDouble(str.substring(i10, str.indexOf(44, i10)).trim());
    }

    @Override // t.c
    public double a(double d10) {
        double d11 = this.f35607e;
        if (d10 < d11) {
            return (d11 * d10) / (((d11 - d10) * this.f35606d) + d10);
        }
        return ((d10 - 1.0d) * (1.0d - d11)) / ((1.0d - d10) - ((d11 - d10) * this.f35606d));
    }

    @Override // t.c
    public double b(double d10) {
        double d11 = this.f35607e;
        if (d10 < d11) {
            double d12 = this.f35606d;
            double d13 = d12 * d11 * d11;
            double d14 = ((d11 - d10) * d12) + d10;
            return d13 / (d14 * d14);
        }
        double d15 = this.f35606d;
        double d16 = d11 - 1.0d;
        double d17 = (((d11 - d10) * (-d15)) - d10) + 1.0d;
        return ((d16 * d15) * d16) / (d17 * d17);
    }
}
