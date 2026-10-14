package x0;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f37367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f37368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f37370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f37371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f37372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f37373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f37374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f37375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b.p f37376j;

    public f() {
        this.f37367a = Math.sqrt(1500.0d);
        this.f37368b = 0.5d;
        this.f37369c = false;
        this.f37375i = Double.MAX_VALUE;
        this.f37376j = new b.p();
    }

    public f(float f10) {
        this.f37367a = Math.sqrt(1500.0d);
        this.f37368b = 0.5d;
        this.f37369c = false;
        this.f37375i = Double.MAX_VALUE;
        this.f37376j = new b.p();
        this.f37375i = f10;
    }

    public f a(float f10) {
        if (f10 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f37367a = Math.sqrt(f10);
        this.f37369c = false;
        return this;
    }

    public b.p b(double d10, double d11, long j10) {
        double dCos;
        double dPow;
        if (!this.f37369c) {
            if (this.f37375i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d12 = this.f37368b;
            if (d12 > 1.0d) {
                double d13 = this.f37367a;
                this.f37372f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                double d14 = this.f37368b;
                double d15 = this.f37367a;
                this.f37373g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
            } else if (d12 >= 0.0d && d12 < 1.0d) {
                this.f37374h = Math.sqrt(1.0d - (d12 * d12)) * this.f37367a;
            }
            this.f37369c = true;
        }
        double d16 = j10 / 1000.0d;
        double d17 = d10 - this.f37375i;
        double d18 = this.f37368b;
        if (d18 > 1.0d) {
            double d19 = this.f37373g;
            double d20 = this.f37372f;
            double d21 = d17 - (((d19 * d17) - d11) / (d19 - d20));
            double d22 = ((d17 * d19) - d11) / (d19 - d20);
            dPow = (Math.pow(2.718281828459045d, this.f37372f * d16) * d22) + (Math.pow(2.718281828459045d, d19 * d16) * d21);
            double d23 = this.f37373g;
            double dPow2 = Math.pow(2.718281828459045d, d23 * d16) * d21 * d23;
            double d24 = this.f37372f;
            dCos = (Math.pow(2.718281828459045d, d24 * d16) * d22 * d24) + dPow2;
        } else if (d18 == 1.0d) {
            double d25 = this.f37367a;
            double d26 = (d25 * d17) + d11;
            double d27 = (d26 * d16) + d17;
            double dPow3 = Math.pow(2.718281828459045d, (-d25) * d16) * d27;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f37367a) * d16) * d27;
            double d28 = this.f37367a;
            dCos = (Math.pow(2.718281828459045d, (-d28) * d16) * d26) + (dPow4 * (-d28));
            dPow = dPow3;
        } else {
            double d29 = 1.0d / this.f37374h;
            double d30 = this.f37367a;
            double d31 = ((d18 * d30 * d17) + d11) * d29;
            double dSin = ((Math.sin(this.f37374h * d16) * d31) + (Math.cos(this.f37374h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d30 * d16);
            double d32 = this.f37367a;
            double d33 = this.f37368b;
            double d34 = (-d32) * dSin * d33;
            double dPow5 = Math.pow(2.718281828459045d, (-d33) * d32 * d16);
            double d35 = this.f37374h;
            double dSin2 = Math.sin(d35 * d16) * (-d35) * d17;
            double d36 = this.f37374h;
            dCos = (((Math.cos(d36 * d16) * d31 * d36) + dSin2) * dPow5) + d34;
            dPow = dSin;
        }
        b.p pVar = this.f37376j;
        pVar.f37360a = (float) (dPow + this.f37375i);
        pVar.f37361b = (float) dCos;
        return pVar;
    }
}
