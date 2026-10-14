package qd;

import fd.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends kc.c<g> implements RandomAccess {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f34913f = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g[] f34914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f34915e;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final void a(long j10, c cVar, int i10, List<? extends g> list, int i11, int i12, List<Integer> list2) throws IOException {
            int i13;
            int i14;
            int i15;
            int i16 = i10;
            if (!(i11 < i12)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (!(list.get(i17).c() >= i16)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            g gVar = list.get(i11);
            g gVar2 = list.get(i12 - 1);
            int i18 = -1;
            if (i16 == gVar.c()) {
                int iIntValue = list2.get(i11).intValue();
                int i19 = i11 + 1;
                g gVar3 = list.get(i19);
                i13 = i19;
                i14 = iIntValue;
                gVar = gVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (gVar.f(i16) == gVar2.f(i16)) {
                int iMin = Math.min(gVar.c(), gVar2.c());
                int i20 = 0;
                for (int i21 = i16; i21 < iMin && gVar.f(i21) == gVar2.f(i21); i21++) {
                    i20++;
                }
                long jB = b(cVar) + j10 + ((long) 2) + ((long) i20) + 1;
                cVar.Y(-i20);
                cVar.Y(i14);
                int i22 = i16 + i20;
                while (i16 < i22) {
                    cVar.Y(gVar.f(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (!(i22 == list.get(i13).c())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    cVar.Y(list2.get(i13).intValue());
                    return;
                } else {
                    c cVar2 = new c();
                    cVar.Y(((int) (b(cVar2) + jB)) * (-1));
                    a(jB, cVar2, i22, list, i13, i12, list2);
                    cVar.v(cVar2);
                    return;
                }
            }
            int i23 = 1;
            for (int i24 = i13 + 1; i24 < i12; i24++) {
                if (list.get(i24 - 1).f(i16) != list.get(i24).f(i16)) {
                    i23++;
                }
            }
            long jB2 = b(cVar) + j10 + ((long) 2) + ((long) (i23 * 2));
            cVar.Y(i23);
            cVar.Y(i14);
            for (int i25 = i13; i25 < i12; i25++) {
                byte bF = list.get(i25).f(i16);
                if (i25 == i13 || bF != list.get(i25 - 1).f(i16)) {
                    cVar.Y(bF & 255);
                }
            }
            c cVar3 = new c();
            while (i13 < i12) {
                byte bF2 = list.get(i13).f(i16);
                int i26 = i13 + 1;
                int i27 = i26;
                while (true) {
                    if (i27 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bF2 != list.get(i27).f(i16)) {
                            i15 = i27;
                            break;
                        }
                        i27++;
                    }
                }
                if (i26 == i15 && i16 + 1 == list.get(i13).c()) {
                    cVar.Y(list2.get(i13).intValue());
                } else {
                    cVar.Y(((int) (b(cVar3) + jB2)) * i18);
                    a(jB2, cVar3, i16 + 1, list, i13, i15, list2);
                }
                cVar3 = cVar3;
                i13 = i15;
                i18 = -1;
            }
            cVar.v(cVar3);
        }

        public final long b(c cVar) {
            return cVar.f34879d / ((long) 4);
        }

        public final q c(g... gVarArr) {
            int i10;
            int i11 = 0;
            if (gVarArr.length == 0) {
                return new q(new g[0], new int[]{0, -1}, null);
            }
            ArrayList arrayList = new ArrayList(new kc.e(gVarArr, false));
            if (arrayList.size() > 1) {
                Collections.sort(arrayList);
            }
            ArrayList arrayList2 = new ArrayList(gVarArr.length);
            for (g gVar : gVarArr) {
                arrayList2.add(-1);
            }
            Object[] array = arrayList2.toArray(new Integer[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Integer[] numArr = (Integer[]) array;
            List<Integer> listF = kc.l.f(Arrays.copyOf(numArr, numArr.length));
            int length = gVarArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                g gVar2 = gVarArr[i12];
                int i14 = i13 + 1;
                int size = arrayList.size();
                int size2 = arrayList.size();
                if (size < 0) {
                    throw new IllegalArgumentException(j1.e.a("fromIndex (", 0, ") is greater than toIndex (", size, ")."));
                }
                if (size > size2) {
                    throw new IndexOutOfBoundsException(j1.e.a("toIndex (", size, ") is greater than size (", size2, ")."));
                }
                int i15 = size - 1;
                int i16 = 0;
                while (true) {
                    if (i16 > i15) {
                        i10 = -(i16 + 1);
                        break;
                    }
                    i10 = (i16 + i15) >>> 1;
                    int iA = lc.a.a((Comparable) arrayList.get(i10), gVar2);
                    if (iA >= 0) {
                        if (iA <= 0) {
                            break;
                        }
                        i15 = i10 - 1;
                    } else {
                        i16 = i10 + 1;
                    }
                }
                listF.set(i10, Integer.valueOf(i13));
                i12++;
                i13 = i14;
            }
            if (!(((g) arrayList.get(0)).c() > 0)) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i17 = 0;
            while (i17 < arrayList.size()) {
                g gVar3 = (g) arrayList.get(i17);
                int i18 = i17 + 1;
                int i19 = i18;
                while (i19 < arrayList.size()) {
                    g gVar4 = (g) arrayList.get(i19);
                    if (!gVar4.j(gVar3)) {
                        break;
                    }
                    if (!(gVar4.c() != gVar3.c())) {
                        throw new IllegalArgumentException(("duplicate option: " + gVar4).toString());
                    }
                    if (listF.get(i19).intValue() > listF.get(i17).intValue()) {
                        arrayList.remove(i19);
                        listF.remove(i19);
                    } else {
                        i19++;
                    }
                }
                i17 = i18;
            }
            c cVar = new c();
            a(0L, cVar, 0, arrayList, 0, arrayList.size(), listF);
            int[] iArr = new int[(int) b(cVar)];
            while (!cVar.y()) {
                iArr[i11] = cVar.readInt();
                i11++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(gVarArr, gVarArr.length);
            j0.h(objArrCopyOf, "copyOf(this, size)");
            return new q((g[]) objArrCopyOf, iArr, null);
        }
    }

    public q(g[] gVarArr, int[] iArr, vc.g gVar) {
        this.f34914d = gVarArr;
        this.f34915e = iArr;
    }

    @Override // kc.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof g) {
            return super.contains((g) obj);
        }
        return false;
    }

    @Override // kc.a
    public int d() {
        return this.f34914d.length;
    }

    @Override // kc.c, java.util.List
    public Object get(int i10) {
        return this.f34914d[i10];
    }

    @Override // kc.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof g) {
            return super.indexOf((g) obj);
        }
        return -1;
    }

    @Override // kc.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof g) {
            return super.lastIndexOf((g) obj);
        }
        return -1;
    }
}
