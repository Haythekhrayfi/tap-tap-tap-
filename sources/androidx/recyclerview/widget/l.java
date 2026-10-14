package androidx.recyclerview.widget;

import androidx.appcompat.widget.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator<f> f2665a = new a();

    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        public int compare(f fVar, f fVar2) {
            f fVar3 = fVar;
            f fVar4 = fVar2;
            int i10 = fVar3.f2680a - fVar4.f2680a;
            return i10 == 0 ? fVar3.f2681b - fVar4.f2681b : i10;
        }
    }

    public static abstract class b {
        public abstract boolean areContentsTheSame(int i10, int i11);

        public abstract boolean areItemsTheSame(int i10, int i11);

        public Object getChangePayload(int i10, int i11) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<f> f2666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f2667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f2668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f2669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f2670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f2671f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f2672g;

        public c(b bVar, List<f> list, int[] iArr, int[] iArr2, boolean z10) {
            this.f2666a = list;
            this.f2667b = iArr;
            this.f2668c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f2669d = bVar;
            int oldListSize = bVar.getOldListSize();
            this.f2670e = oldListSize;
            int newListSize = bVar.getNewListSize();
            this.f2671f = newListSize;
            this.f2672g = z10;
            f fVar = list.isEmpty() ? null : list.get(0);
            if (fVar == null || fVar.f2680a != 0 || fVar.f2681b != 0) {
                f fVar2 = new f();
                fVar2.f2680a = 0;
                fVar2.f2681b = 0;
                fVar2.f2683d = false;
                fVar2.f2682c = 0;
                fVar2.f2684e = false;
                list.add(0, fVar2);
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                f fVar3 = this.f2666a.get(size);
                int i10 = fVar3.f2680a;
                int i11 = fVar3.f2682c;
                int i12 = i10 + i11;
                int i13 = fVar3.f2681b + i11;
                if (this.f2672g) {
                    while (oldListSize > i12) {
                        int i14 = oldListSize - 1;
                        if (this.f2667b[i14] == 0) {
                            b(oldListSize, newListSize, size, false);
                        }
                        oldListSize = i14;
                    }
                    while (newListSize > i13) {
                        int i15 = newListSize - 1;
                        if (this.f2668c[i15] == 0) {
                            b(oldListSize, newListSize, size, true);
                        }
                        newListSize = i15;
                    }
                }
                for (int i16 = 0; i16 < fVar3.f2682c; i16++) {
                    int i17 = fVar3.f2680a + i16;
                    int i18 = fVar3.f2681b + i16;
                    int i19 = this.f2669d.areContentsTheSame(i17, i18) ? 1 : 2;
                    this.f2667b[i17] = (i18 << 5) | i19;
                    this.f2668c[i18] = (i17 << 5) | i19;
                }
                oldListSize = fVar3.f2680a;
                newListSize = fVar3.f2681b;
            }
        }

        public static d c(List<d> list, int i10, boolean z10) {
            int size = list.size() - 1;
            while (size >= 0) {
                d dVar = list.get(size);
                if (dVar.f2673a == i10 && dVar.f2675c == z10) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f2674b += z10 ? 1 : -1;
                        size++;
                    }
                    return dVar;
                }
                size--;
            }
            return null;
        }

        public void a(RecyclerView.g gVar) {
            int i10;
            f fVar;
            u bVar = new androidx.recyclerview.widget.b(gVar);
            androidx.recyclerview.widget.c cVar = bVar instanceof androidx.recyclerview.widget.c ? (androidx.recyclerview.widget.c) bVar : new androidx.recyclerview.widget.c(bVar);
            ArrayList arrayList = new ArrayList();
            int i11 = this.f2670e;
            int i12 = this.f2671f;
            int size = this.f2666a.size() - 1;
            while (size >= 0) {
                f fVar2 = this.f2666a.get(size);
                int i13 = fVar2.f2682c;
                int i14 = fVar2.f2680a + i13;
                int i15 = fVar2.f2681b + i13;
                int i16 = 4;
                if (i14 < i11) {
                    int i17 = i11 - i14;
                    if (this.f2672g) {
                        int i18 = i17 - 1;
                        while (i18 >= 0) {
                            int[] iArr = this.f2667b;
                            int i19 = i14 + i18;
                            int i20 = iArr[i19] & 31;
                            if (i20 == 0) {
                                i10 = size;
                                fVar = fVar2;
                                int i21 = 1;
                                cVar.c(i19, 1);
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((d) it.next()).f2674b -= i21;
                                    i21 = 1;
                                }
                            } else if (i20 == i16 || i20 == 8) {
                                int i22 = iArr[i19] >> 5;
                                d dVarC = c(arrayList, i22, false);
                                i10 = size;
                                fVar = fVar2;
                                cVar.a(i19, dVarC.f2674b - 1);
                                if (i20 == 4) {
                                    cVar.d(dVarC.f2674b - 1, 1, this.f2669d.getChangePayload(i19, i22));
                                }
                            } else {
                                if (i20 != 16) {
                                    StringBuilder sbA = r0.a("unknown flag for pos ", i19, " ");
                                    sbA.append(Long.toBinaryString(i20));
                                    throw new IllegalStateException(sbA.toString());
                                }
                                arrayList.add(new d(i19, i19, true));
                                i10 = size;
                                fVar = fVar2;
                            }
                            i18--;
                            i16 = 4;
                            size = i10;
                            fVar2 = fVar;
                        }
                    } else {
                        cVar.c(i14, i17);
                    }
                }
                int i23 = size;
                f fVar3 = fVar2;
                if (i15 < i12) {
                    int i24 = i12 - i15;
                    if (this.f2672g) {
                        while (true) {
                            i24--;
                            if (i24 < 0) {
                                break;
                            }
                            int[] iArr2 = this.f2668c;
                            int i25 = i15 + i24;
                            int i26 = iArr2[i25] & 31;
                            if (i26 == 0) {
                                int i27 = 1;
                                cVar.b(i14, 1);
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    ((d) it2.next()).f2674b += i27;
                                    i27 = 1;
                                }
                            } else if (i26 == 4 || i26 == 8) {
                                int i28 = iArr2[i25] >> 5;
                                cVar.a(c(arrayList, i28, true).f2674b, i14);
                                if (i26 == 4) {
                                    cVar.d(i14, 1, this.f2669d.getChangePayload(i28, i25));
                                }
                            } else {
                                if (i26 != 16) {
                                    StringBuilder sbA2 = r0.a("unknown flag for pos ", i25, " ");
                                    sbA2.append(Long.toBinaryString(i26));
                                    throw new IllegalStateException(sbA2.toString());
                                }
                                arrayList.add(new d(i25, i14, false));
                            }
                        }
                    } else {
                        cVar.b(i14, i24);
                    }
                }
                int i29 = i13 - 1;
                while (i29 >= 0) {
                    int[] iArr3 = this.f2667b;
                    f fVar4 = fVar3;
                    int i30 = fVar4.f2680a + i29;
                    if ((iArr3[i30] & 31) == 2) {
                        cVar.d(i30, 1, this.f2669d.getChangePayload(i30, fVar4.f2681b + i29));
                    }
                    i29--;
                    fVar3 = fVar4;
                }
                f fVar5 = fVar3;
                i11 = fVar5.f2680a;
                i12 = fVar5.f2681b;
                size = i23 - 1;
            }
            cVar.e();
        }

        public final boolean b(int i10, int i11, int i12, boolean z10) {
            int i13;
            int i14;
            int i15;
            if (z10) {
                i11--;
                i14 = i10;
                i13 = i11;
            } else {
                i13 = i10 - 1;
                i14 = i13;
            }
            while (i12 >= 0) {
                f fVar = this.f2666a.get(i12);
                int i16 = fVar.f2680a;
                int i17 = fVar.f2682c;
                int i18 = i16 + i17;
                int i19 = fVar.f2681b + i17;
                if (z10) {
                    for (int i20 = i14 - 1; i20 >= i18; i20--) {
                        if (this.f2669d.areItemsTheSame(i20, i13)) {
                            i15 = this.f2669d.areContentsTheSame(i20, i13) ? 8 : 4;
                            this.f2668c[i13] = (i20 << 5) | 16;
                            this.f2667b[i20] = (i13 << 5) | i15;
                            return true;
                        }
                    }
                } else {
                    for (int i21 = i11 - 1; i21 >= i19; i21--) {
                        if (this.f2669d.areItemsTheSame(i13, i21)) {
                            i15 = this.f2669d.areContentsTheSame(i13, i21) ? 8 : 4;
                            int i22 = i10 - 1;
                            this.f2667b[i22] = (i21 << 5) | 16;
                            this.f2668c[i21] = (i22 << 5) | i15;
                            return true;
                        }
                    }
                }
                i14 = fVar.f2680a;
                i11 = fVar.f2681b;
                i12--;
            }
            return false;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2675c;

        public d(int i10, int i11, boolean z10) {
            this.f2673a = i10;
            this.f2674b = i11;
            this.f2675c = z10;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2679d;

        public e() {
        }

        public e(int i10, int i11, int i12, int i13) {
            this.f2676a = i10;
            this.f2677b = i11;
            this.f2678c = i12;
            this.f2679d = i13;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2684e;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:27:0x00b9
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static androidx.recyclerview.widget.l.c a(androidx.recyclerview.widget.l.b r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.a(androidx.recyclerview.widget.l$b, boolean):androidx.recyclerview.widget.l$c");
    }
}
