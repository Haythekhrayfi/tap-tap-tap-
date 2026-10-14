package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class c implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f2585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2586b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2587c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2588d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2589e = null;

    public c(u uVar) {
        this.f2585a = uVar;
    }

    @Override // androidx.recyclerview.widget.u
    public void a(int i10, int i11) {
        e();
        this.f2585a.a(i10, i11);
    }

    @Override // androidx.recyclerview.widget.u
    public void b(int i10, int i11) {
        int i12;
        if (this.f2586b == 1 && i10 >= (i12 = this.f2587c)) {
            int i13 = this.f2588d;
            if (i10 <= i12 + i13) {
                this.f2588d = i13 + i11;
                this.f2587c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f2587c = i10;
        this.f2588d = i11;
        this.f2586b = 1;
    }

    @Override // androidx.recyclerview.widget.u
    public void c(int i10, int i11) {
        int i12;
        if (this.f2586b == 2 && (i12 = this.f2587c) >= i10 && i12 <= i10 + i11) {
            this.f2588d += i11;
            this.f2587c = i10;
        } else {
            e();
            this.f2587c = i10;
            this.f2588d = i11;
            this.f2586b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.u
    public void d(int i10, int i11, Object obj) {
        int i12;
        if (this.f2586b == 3) {
            int i13 = this.f2587c;
            int i14 = this.f2588d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f2589e == obj) {
                this.f2587c = Math.min(i10, i13);
                this.f2588d = Math.max(i14 + i13, i12) - this.f2587c;
                return;
            }
        }
        e();
        this.f2587c = i10;
        this.f2588d = i11;
        this.f2589e = obj;
        this.f2586b = 3;
    }

    public void e() {
        int i10 = this.f2586b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f2585a.b(this.f2587c, this.f2588d);
        } else if (i10 == 2) {
            this.f2585a.c(this.f2587c, this.f2588d);
        } else if (i10 == 3) {
            this.f2585a.d(this.f2587c, this.f2588d, this.f2589e);
        }
        this.f2589e = null;
        this.f2586b = 0;
    }
}
