package r8;

import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f35298b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35299a;

    public static final class a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f35300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f35301d;

        public a(int i10, int i11) {
            super(i11, null);
            this.f35300c = i10;
            this.f35301d = i11;
        }

        @Override // r8.d
        public int a() {
            if (this.f35299a <= 0) {
                return -1;
            }
            return Math.min(this.f35300c + 1, this.f35301d - 1);
        }

        @Override // r8.d
        public int b() {
            if (this.f35299a <= 0) {
                return -1;
            }
            return Math.max(0, this.f35300c - 1);
        }
    }

    public static final class b {
        public b() {
        }

        public b(g gVar) {
        }
    }

    public static final class c extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f35302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f35303d;

        public c(int i10, int i11) {
            super(i11, null);
            this.f35302c = i10;
            this.f35303d = i11;
        }

        @Override // r8.d
        public int a() {
            if (this.f35299a <= 0) {
                return -1;
            }
            return (this.f35302c + 1) % this.f35303d;
        }

        @Override // r8.d
        public int b() {
            if (this.f35299a <= 0) {
                return -1;
            }
            int i10 = this.f35303d;
            return ((this.f35302c - 1) + i10) % i10;
        }
    }

    public d(int i10, g gVar) {
        this.f35299a = i10;
    }

    public abstract int a();

    public abstract int b();
}
