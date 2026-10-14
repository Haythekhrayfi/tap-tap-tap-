package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f2602b = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2603a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2606d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2607e;

        public boolean a() {
            int i10 = this.f2603a;
            if ((i10 & 7) != 0 && (i10 & (b(this.f2606d, this.f2604b) << 0)) == 0) {
                return false;
            }
            int i11 = this.f2603a;
            if ((i11 & 112) != 0 && (i11 & (b(this.f2606d, this.f2605c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f2603a;
            if ((i12 & 1792) != 0 && (i12 & (b(this.f2607e, this.f2604b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f2603a;
            return (i13 & 28672) == 0 || (i13 & (b(this.f2607e, this.f2605c) << 12)) != 0;
        }

        public int b(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }
    }

    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i10);

        int e(View view);
    }

    public e0(b bVar) {
        this.f2601a = bVar;
    }

    public View a(int i10, int i11, int i12, int i13) {
        int iB = this.f2601a.b();
        int iC = this.f2601a.c();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewD = this.f2601a.d(i10);
            int iA = this.f2601a.a(viewD);
            int iE = this.f2601a.e(viewD);
            a aVar = this.f2602b;
            aVar.f2604b = iB;
            aVar.f2605c = iC;
            aVar.f2606d = iA;
            aVar.f2607e = iE;
            if (i12 != 0) {
                aVar.f2603a = 0;
                aVar.f2603a = i12 | 0;
                if (aVar.a()) {
                    return viewD;
                }
            }
            if (i13 != 0) {
                a aVar2 = this.f2602b;
                aVar2.f2603a = 0;
                aVar2.f2603a = i13 | 0;
                if (aVar2.a()) {
                    view = viewD;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean b(View view, int i10) {
        a aVar = this.f2602b;
        int iB = this.f2601a.b();
        int iC = this.f2601a.c();
        int iA = this.f2601a.a(view);
        int iE = this.f2601a.e(view);
        aVar.f2604b = iB;
        aVar.f2605c = iC;
        aVar.f2606d = iA;
        aVar.f2607e = iE;
        if (i10 == 0) {
            return false;
        }
        a aVar2 = this.f2602b;
        aVar2.f2603a = 0;
        aVar2.f2603a = 0 | i10;
        return aVar2.a();
    }
}
