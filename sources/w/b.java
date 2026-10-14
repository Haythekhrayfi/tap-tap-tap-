package w;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<v.f> f37017a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f37018b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v.g f37019c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v.f.b f37020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v.f.b f37021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f37022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f37023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f37024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f37025f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f37026g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f37027h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f37028i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f37029j;
    }

    /* JADX INFO: renamed from: w.b$b, reason: collision with other inner class name */
    public interface InterfaceC0443b {
    }

    public b(v.g gVar) {
        this.f37019c = gVar;
    }

    public final boolean a(InterfaceC0443b interfaceC0443b, v.f fVar, int i10) {
        this.f37018b.f37020a = fVar.r();
        this.f37018b.f37021b = fVar.y();
        this.f37018b.f37022c = fVar.z();
        this.f37018b.f37023d = fVar.q();
        a aVar = this.f37018b;
        aVar.f37028i = false;
        aVar.f37029j = i10;
        v.f.b bVar = aVar.f37020a;
        v.f.b bVar2 = v.f.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f37021b == bVar2;
        boolean z12 = z10 && fVar.f36578b0 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        boolean z13 = z11 && fVar.f36578b0 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (z12 && fVar.f36615u[0] == 4) {
            aVar.f37020a = v.f.b.FIXED;
        }
        if (z13 && fVar.f36615u[1] == 4) {
            aVar.f37021b = v.f.b.FIXED;
        }
        ((ConstraintLayout.c) interfaceC0443b).b(fVar, aVar);
        fVar.Z(this.f37018b.f37024e);
        fVar.U(this.f37018b.f37025f);
        a aVar2 = this.f37018b;
        fVar.H = aVar2.f37027h;
        fVar.R(aVar2.f37026g);
        a aVar3 = this.f37018b;
        aVar3.f37029j = 0;
        return aVar3.f37028i;
    }

    public final void b(v.g gVar, int i10, int i11, int i12) {
        int i13 = gVar.f36596k0;
        int i14 = gVar.f36598l0;
        gVar.X(0);
        gVar.W(0);
        gVar.Z = i11;
        int i15 = gVar.f36596k0;
        if (i11 < i15) {
            gVar.Z = i15;
        }
        gVar.f36576a0 = i12;
        int i16 = gVar.f36598l0;
        if (i12 < i16) {
            gVar.f36576a0 = i16;
        }
        gVar.X(i13);
        gVar.W(i14);
        v.g gVar2 = this.f37019c;
        gVar2.S0 = i10;
        gVar2.c0();
    }

    public void c(v.g gVar) {
        this.f37017a.clear();
        int size = gVar.P0.size();
        for (int i10 = 0; i10 < size; i10++) {
            v.f fVar = gVar.P0.get(i10);
            v.f.b bVarR = fVar.r();
            v.f.b bVar = v.f.b.MATCH_CONSTRAINT;
            if (bVarR == bVar || fVar.y() == bVar) {
                this.f37017a.add(fVar);
            }
        }
        gVar.k0();
    }
}
