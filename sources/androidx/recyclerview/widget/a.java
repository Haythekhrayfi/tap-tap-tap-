package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a implements v.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0040a f2575d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0.e<b> f2572a = new o0.f(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f2573b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<b> f2574c = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2577f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f2576e = new v(this);

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0040a {
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f2580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2581d;

        public b(int i10, int i11, int i12, Object obj) {
            this.f2578a = i10;
            this.f2579b = i11;
            this.f2581d = i12;
            this.f2580c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f2578a;
            if (i10 != bVar.f2578a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f2581d - this.f2579b) == 1 && this.f2581d == bVar.f2579b && this.f2579b == bVar.f2581d) {
                return true;
            }
            if (this.f2581d != bVar.f2581d || this.f2579b != bVar.f2579b) {
                return false;
            }
            Object obj2 = this.f2580c;
            Object obj3 = bVar.f2580c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2578a * 31) + this.f2579b) * 31) + this.f2581d;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i10 = this.f2578a;
            if (i10 == 1) {
                str = "add";
            } else if (i10 == 2) {
                str = "rm";
            } else if (i10 != 4) {
                str = i10 != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb2.append(str);
            sb2.append(",s:");
            sb2.append(this.f2579b);
            sb2.append("c:");
            sb2.append(this.f2581d);
            sb2.append(",p:");
            return o0.c.a(sb2, this.f2580c, "]");
        }
    }

    public a(InterfaceC0040a interfaceC0040a) {
        this.f2575d = interfaceC0040a;
    }

    public final boolean a(int i10) {
        int size = this.f2574c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f2574c.get(i11);
            int i12 = bVar.f2578a;
            if (i12 == 8) {
                if (f(bVar.f2581d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f2579b;
                int i14 = bVar.f2581d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        int size = this.f2574c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((RecyclerView.f) this.f2575d).a(this.f2574c.get(i10));
        }
        l(this.f2574c);
        this.f2577f = 0;
    }

    public void c() {
        b();
        int size = this.f2573b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f2573b.get(i10);
            int i11 = bVar.f2578a;
            if (i11 == 1) {
                ((RecyclerView.f) this.f2575d).a(bVar);
                RecyclerView.f fVar = (RecyclerView.f) this.f2575d;
                RecyclerView.this.offsetPositionRecordsForInsert(bVar.f2579b, bVar.f2581d);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            } else if (i11 == 2) {
                ((RecyclerView.f) this.f2575d).a(bVar);
                InterfaceC0040a interfaceC0040a = this.f2575d;
                int i12 = bVar.f2579b;
                int i13 = bVar.f2581d;
                RecyclerView.f fVar2 = (RecyclerView.f) interfaceC0040a;
                RecyclerView.this.offsetPositionRecordsForRemove(i12, i13, true);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mItemsAddedOrRemoved = true;
                recyclerView.mState.f2507c += i13;
            } else if (i11 == 4) {
                ((RecyclerView.f) this.f2575d).a(bVar);
                ((RecyclerView.f) this.f2575d).c(bVar.f2579b, bVar.f2581d, bVar.f2580c);
            } else if (i11 == 8) {
                ((RecyclerView.f) this.f2575d).a(bVar);
                RecyclerView.f fVar3 = (RecyclerView.f) this.f2575d;
                RecyclerView.this.offsetPositionRecordsForMove(bVar.f2579b, bVar.f2581d);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }
        }
        l(this.f2573b);
        this.f2577f = 0;
    }

    public final void d(b bVar) {
        int i10;
        int i11 = bVar.f2578a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM = m(bVar.f2579b, i11);
        int i12 = bVar.f2579b;
        int i13 = bVar.f2578a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f2581d; i15++) {
            int iM2 = m((i10 * i15) + bVar.f2579b, bVar.f2578a);
            int i16 = bVar.f2578a;
            if (i16 == 2 ? iM2 == iM : i16 == 4 && iM2 == iM + 1) {
                i14++;
            } else {
                b bVarH = h(i16, iM, i14, bVar.f2580c);
                e(bVarH, i12);
                k(bVarH);
                if (bVar.f2578a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iM = iM2;
            }
        }
        Object obj = bVar.f2580c;
        k(bVar);
        if (i14 > 0) {
            b bVarH2 = h(bVar.f2578a, iM, i14, obj);
            e(bVarH2, i12);
            k(bVarH2);
        }
    }

    public void e(b bVar, int i10) {
        ((RecyclerView.f) this.f2575d).a(bVar);
        int i11 = bVar.f2578a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            RecyclerView.f fVar = (RecyclerView.f) this.f2575d;
            RecyclerView.this.viewRangeUpdate(i10, bVar.f2581d, bVar.f2580c);
            RecyclerView.this.mItemsChanged = true;
            return;
        }
        InterfaceC0040a interfaceC0040a = this.f2575d;
        int i12 = bVar.f2581d;
        RecyclerView.f fVar2 = (RecyclerView.f) interfaceC0040a;
        RecyclerView.this.offsetPositionRecordsForRemove(i10, i12, true);
        RecyclerView recyclerView = RecyclerView.this;
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.f2507c += i12;
    }

    public int f(int i10, int i11) {
        int size = this.f2574c.size();
        while (i11 < size) {
            b bVar = this.f2574c.get(i11);
            int i12 = bVar.f2578a;
            if (i12 == 8) {
                int i13 = bVar.f2579b;
                if (i13 == i10) {
                    i10 = bVar.f2581d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f2581d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f2579b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f2581d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f2581d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean g() {
        return this.f2573b.size() > 0;
    }

    public b h(int i10, int i11, int i12, Object obj) {
        b bVarB = this.f2572a.b();
        if (bVarB == null) {
            return new b(i10, i11, i12, obj);
        }
        bVarB.f2578a = i10;
        bVarB.f2579b = i11;
        bVarB.f2581d = i12;
        bVarB.f2580c = obj;
        return bVarB;
    }

    public final void i(b bVar) {
        this.f2574c.add(bVar);
        int i10 = bVar.f2578a;
        if (i10 == 1) {
            RecyclerView.f fVar = (RecyclerView.f) this.f2575d;
            RecyclerView.this.offsetPositionRecordsForInsert(bVar.f2579b, bVar.f2581d);
            RecyclerView.this.mItemsAddedOrRemoved = true;
            return;
        }
        if (i10 == 2) {
            RecyclerView.f fVar2 = (RecyclerView.f) this.f2575d;
            RecyclerView.this.offsetPositionRecordsForRemove(bVar.f2579b, bVar.f2581d, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
            return;
        }
        if (i10 == 4) {
            ((RecyclerView.f) this.f2575d).c(bVar.f2579b, bVar.f2581d, bVar.f2580c);
        } else {
            if (i10 != 8) {
                throw new IllegalArgumentException("Unknown update op type for " + bVar);
            }
            RecyclerView.f fVar3 = (RecyclerView.f) this.f2575d;
            RecyclerView.this.offsetPositionRecordsForMove(bVar.f2579b, bVar.f2581d);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:178:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0177 A[PHI: r4
  0x0177: PHI (r4v15 int) = (r4v9 int), (r4v19 int) binds: [B:95:0x0175, B:82:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    public void j() {
        boolean z10;
        byte b10;
        b bVarH;
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        int i13;
        v vVar = this.f2576e;
        ArrayList<b> arrayList = this.f2573b;
        Objects.requireNonNull(vVar);
        while (true) {
            int size = arrayList.size() - 1;
            boolean z13 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).f2578a == 8) {
                    if (z13) {
                        break;
                    }
                } else {
                    z13 = true;
                }
                size--;
            }
            b bVarH2 = null;
            if (size == -1) {
                break;
            }
            int i14 = size + 1;
            b bVar = arrayList.get(size);
            b bVar2 = arrayList.get(i14);
            int i15 = bVar2.f2578a;
            if (i15 == 1) {
                int i16 = bVar.f2581d;
                int i17 = bVar2.f2579b;
                int i18 = i16 < i17 ? -1 : 0;
                int i19 = bVar.f2579b;
                if (i19 < i17) {
                    i18++;
                }
                if (i17 <= i19) {
                    bVar.f2579b = i19 + bVar2.f2581d;
                }
                int i20 = bVar2.f2579b;
                if (i20 <= i16) {
                    bVar.f2581d = i16 + bVar2.f2581d;
                }
                bVar2.f2579b = i20 + i18;
                arrayList.set(size, bVar2);
                arrayList.set(i14, bVar);
            } else if (i15 == 2) {
                int i21 = bVar.f2579b;
                int i22 = bVar.f2581d;
                int i23 = bVar2.f2579b;
                if (i21 < i22) {
                    if (i23 == i21 && bVar2.f2581d == i22 - i21) {
                        z12 = true;
                        z11 = false;
                    } else {
                        z12 = false;
                        z11 = z12;
                    }
                } else if (i23 == i22 + 1 && bVar2.f2581d == i21 - i22) {
                    z12 = true;
                    z11 = z12;
                } else {
                    z11 = true;
                    z12 = false;
                }
                if (i22 < i23) {
                    bVar2.f2579b = i23 - 1;
                } else {
                    int i24 = bVar2.f2581d;
                    if (i22 < i23 + i24) {
                        bVar2.f2581d = i24 - 1;
                        bVar.f2578a = 2;
                        bVar.f2581d = 1;
                        if (bVar2.f2581d == 0) {
                            arrayList.remove(i14);
                            ((a) vVar.f2793a).k(bVar2);
                        }
                    }
                }
                int i25 = bVar.f2579b;
                int i26 = bVar2.f2579b;
                if (i25 <= i26) {
                    bVar2.f2579b = i26 + 1;
                } else {
                    int i27 = i26 + bVar2.f2581d;
                    if (i25 < i27) {
                        bVarH2 = ((a) vVar.f2793a).h(2, i25 + 1, i27 - i25, null);
                        bVar2.f2581d = bVar.f2579b - bVar2.f2579b;
                    }
                }
                if (z12) {
                    arrayList.set(size, bVar2);
                    arrayList.remove(i14);
                    ((a) vVar.f2793a).k(bVar);
                } else {
                    if (z11) {
                        if (bVarH2 != null) {
                            int i28 = bVar.f2579b;
                            if (i28 > bVarH2.f2579b) {
                                bVar.f2579b = i28 - bVarH2.f2581d;
                            }
                            int i29 = bVar.f2581d;
                            if (i29 > bVarH2.f2579b) {
                                bVar.f2581d = i29 - bVarH2.f2581d;
                            }
                        }
                        int i30 = bVar.f2579b;
                        if (i30 > bVar2.f2579b) {
                            bVar.f2579b = i30 - bVar2.f2581d;
                        }
                        i13 = bVar.f2581d;
                        if (i13 > bVar2.f2579b) {
                            bVar.f2581d = i13 - bVar2.f2581d;
                        }
                    } else {
                        if (bVarH2 != null) {
                            int i31 = bVar.f2579b;
                            if (i31 >= bVarH2.f2579b) {
                                bVar.f2579b = i31 - bVarH2.f2581d;
                            }
                            int i32 = bVar.f2581d;
                            if (i32 >= bVarH2.f2579b) {
                                bVar.f2581d = i32 - bVarH2.f2581d;
                            }
                        }
                        int i33 = bVar.f2579b;
                        if (i33 >= bVar2.f2579b) {
                            bVar.f2579b = i33 - bVar2.f2581d;
                        }
                        i13 = bVar.f2581d;
                        if (i13 >= bVar2.f2579b) {
                            bVar.f2581d = i13 - bVar2.f2581d;
                        }
                    }
                    arrayList.set(size, bVar2);
                    if (bVar.f2579b != bVar.f2581d) {
                        arrayList.set(i14, bVar);
                    } else {
                        arrayList.remove(i14);
                    }
                    if (bVarH2 != null) {
                        arrayList.add(size, bVarH2);
                    }
                }
            } else if (i15 == 4) {
                int i34 = bVar.f2581d;
                int i35 = bVar2.f2579b;
                if (i34 < i35) {
                    bVar2.f2579b = i35 - 1;
                } else {
                    int i36 = bVar2.f2581d;
                    if (i34 < i35 + i36) {
                        bVar2.f2581d = i36 - 1;
                        bVarH = ((a) vVar.f2793a).h(4, bVar.f2579b, 1, bVar2.f2580c);
                    }
                    i10 = bVar.f2579b;
                    i11 = bVar2.f2579b;
                    if (i10 <= i11) {
                        bVar2.f2579b = i11 + 1;
                    } else {
                        i12 = i11 + bVar2.f2581d;
                        if (i10 < i12) {
                            int i37 = i12 - i10;
                            bVarH2 = ((a) vVar.f2793a).h(4, i10 + 1, i37, bVar2.f2580c);
                            bVar2.f2581d -= i37;
                        }
                    }
                    arrayList.set(i14, bVar);
                    if (bVar2.f2581d > 0) {
                        arrayList.set(size, bVar2);
                    } else {
                        arrayList.remove(size);
                        ((a) vVar.f2793a).k(bVar2);
                    }
                    if (bVarH != null) {
                        arrayList.add(size, bVarH);
                    }
                    if (bVarH2 != null) {
                        arrayList.add(size, bVarH2);
                    }
                }
                bVarH = null;
                i10 = bVar.f2579b;
                i11 = bVar2.f2579b;
                if (i10 <= i11) {
                    bVar2.f2579b = i11 + 1;
                } else {
                    i12 = i11 + bVar2.f2581d;
                    if (i10 < i12) {
                        int i38 = i12 - i10;
                        bVarH2 = ((a) vVar.f2793a).h(4, i10 + 1, i38, bVar2.f2580c);
                        bVar2.f2581d -= i38;
                    }
                }
                arrayList.set(i14, bVar);
                if (bVar2.f2581d > 0) {
                    arrayList.set(size, bVar2);
                } else {
                    arrayList.remove(size);
                    ((a) vVar.f2793a).k(bVar2);
                }
                if (bVarH != null) {
                    arrayList.add(size, bVarH);
                }
                if (bVarH2 != null) {
                    arrayList.add(size, bVarH2);
                }
            }
        }
        int size2 = this.f2573b.size();
        for (int i39 = 0; i39 < size2; i39++) {
            b bVarH3 = this.f2573b.get(i39);
            int i40 = bVarH3.f2578a;
            if (i40 == 1) {
                i(bVarH3);
            } else if (i40 == 2) {
                int i41 = bVarH3.f2579b;
                int i42 = bVarH3.f2581d + i41;
                int i43 = i41;
                byte b11 = -1;
                int i44 = 0;
                while (i43 < i42) {
                    if (((RecyclerView.f) this.f2575d).b(i43) != null || a(i43)) {
                        if (b11 == 0) {
                            d(h(2, i41, i44, null));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b10 = 1;
                    } else {
                        if (b11 == 1) {
                            i(h(2, i41, i44, null));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b10 = 0;
                    }
                    if (z10) {
                        i43 -= i44;
                        i42 -= i44;
                        i44 = 1;
                    } else {
                        i44++;
                    }
                    i43++;
                    b11 = b10;
                }
                if (i44 != bVarH3.f2581d) {
                    k(bVarH3);
                    bVarH3 = h(2, i41, i44, null);
                }
                if (b11 == 0) {
                    d(bVarH3);
                } else {
                    i(bVarH3);
                }
            } else if (i40 == 4) {
                int i45 = bVarH3.f2579b;
                int i46 = bVarH3.f2581d + i45;
                byte b12 = -1;
                int i47 = i45;
                int i48 = 0;
                while (i45 < i46) {
                    if (((RecyclerView.f) this.f2575d).b(i45) != null || a(i45)) {
                        if (b12 == 0) {
                            d(h(4, i47, i48, bVarH3.f2580c));
                            i47 = i45;
                            i48 = 0;
                        }
                        b12 = 1;
                    } else {
                        if (b12 == 1) {
                            i(h(4, i47, i48, bVarH3.f2580c));
                            i47 = i45;
                            i48 = 0;
                        }
                        b12 = 0;
                    }
                    i48++;
                    i45++;
                }
                if (i48 != bVarH3.f2581d) {
                    Object obj = bVarH3.f2580c;
                    k(bVarH3);
                    bVarH3 = h(4, i47, i48, obj);
                }
                if (b12 == 0) {
                    d(bVarH3);
                } else {
                    i(bVarH3);
                }
            } else if (i40 == 8) {
                i(bVarH3);
            }
        }
        this.f2573b.clear();
    }

    public void k(b bVar) {
        bVar.f2580c = null;
        this.f2572a.a(bVar);
    }

    public void l(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            k(list.get(i10));
        }
        list.clear();
    }

    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    public final int m(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        for (int size = this.f2574c.size() - 1; size >= 0; size--) {
            b bVar = this.f2574c.get(size);
            int i18 = bVar.f2578a;
            if (i18 == 8) {
                int i19 = bVar.f2579b;
                int i20 = bVar.f2581d;
                if (i19 < i20) {
                    i14 = i19;
                    i13 = i20;
                } else {
                    i13 = i19;
                    i14 = i20;
                }
                if (i10 < i14 || i10 > i13) {
                    if (i10 < i19) {
                        if (i11 == 1) {
                            bVar.f2579b = i19 + 1;
                            i15 = i20 + 1;
                        } else if (i11 == 2) {
                            bVar.f2579b = i19 - 1;
                            i15 = i20 - 1;
                        }
                        bVar.f2581d = i15;
                    }
                } else if (i14 == i19) {
                    if (i11 == 1) {
                        i17 = i20 + 1;
                    } else {
                        if (i11 == 2) {
                            i17 = i20 - 1;
                        }
                        i10++;
                    }
                    bVar.f2581d = i17;
                    i10++;
                } else {
                    if (i11 == 1) {
                        i16 = i19 + 1;
                    } else {
                        if (i11 == 2) {
                            i16 = i19 - 1;
                        }
                        i10--;
                    }
                    bVar.f2579b = i16;
                    i10--;
                }
            } else {
                int i21 = bVar.f2579b;
                if (i21 > i10) {
                    if (i11 == 1) {
                        i12 = i21 + 1;
                    } else if (i11 == 2) {
                        i12 = i21 - 1;
                    }
                    bVar.f2579b = i12;
                } else if (i18 == 1) {
                    i10 -= bVar.f2581d;
                } else if (i18 == 2) {
                    i10 += bVar.f2581d;
                }
            }
        }
        for (int size2 = this.f2574c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f2574c.get(size2);
            if (bVar2.f2578a == 8) {
                int i22 = bVar2.f2581d;
                if (i22 == bVar2.f2579b || i22 < 0) {
                    this.f2574c.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.f2581d <= 0) {
                this.f2574c.remove(size2);
                k(bVar2);
            }
        }
        return i10;
    }
}
