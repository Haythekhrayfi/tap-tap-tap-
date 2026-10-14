package t9;

/* JADX INFO: loaded from: classes2.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35837b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35838c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f35839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f35840e;

    public interface a {
    }

    public o(int i10, a aVar) {
        this.f35836a = i10;
        this.f35840e = aVar;
        this.f35839d = new int[i10];
    }

    public int a() {
        if (this.f35837b < 0) {
            this.f35837b = ((com.applovin.exoplayer2.a.o) this.f35840e).a(0);
        }
        return this.f35837b;
    }

    public int b() {
        if (this.f35838c < 0) {
            int iA = a();
            for (int i10 = 1; i10 < this.f35836a; i10++) {
                iA = Math.max(iA, ((com.applovin.exoplayer2.a.o) this.f35840e).a(i10));
            }
            this.f35838c = iA;
        }
        return this.f35838c;
    }

    public int c(int i10) {
        int i11 = this.f35836a;
        if (i11 == 0) {
            return 0;
        }
        if (i10 < 0) {
            return c(0);
        }
        if (i10 >= i11) {
            return c(i11);
        }
        int[] iArr = this.f35839d;
        if (iArr[i10] <= 0) {
            iArr[i10] = ((com.applovin.exoplayer2.a.o) this.f35840e).a(i10);
        }
        return this.f35839d[i10];
    }
}
