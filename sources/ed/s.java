package ed;

import fd.j0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends vc.l implements uc.p<CharSequence, Integer, jc.h<? extends Integer, ? extends Integer>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<String> f29159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f29160d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(List<String> list, boolean z10) {
        super(2);
        this.f29159c = list;
        this.f29160d = z10;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ea A[EDGE_INSN: B:56:0x00ea->B:57:0x00eb BREAK  A[LOOP:0: B:27:0x0074->B:38:0x00a7]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc.p
    public jc.h<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        Object next;
        jc.h hVar;
        String str;
        Object next2;
        String str2;
        CharSequence charSequence2 = charSequence;
        int iIntValue = num.intValue();
        j0.i(charSequence2, "$this$$receiver");
        List<String> list = this.f29159c;
        boolean z10 = this.f29160d;
        if (z10 || list.size() != 1) {
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            bd.c cVar = new bd.c(iIntValue, charSequence2.length());
            if (!(charSequence2 instanceof String)) {
                int i10 = cVar.f3515c;
                int i11 = cVar.f3516d;
                int i12 = cVar.f3517e;
                if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                    while (true) {
                        Iterator<T> it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            str = (String) next;
                        } while (!u.L(str, 0, charSequence2, i10, str.length(), z10));
                        String str3 = (String) next;
                        if (str3 == null) {
                            if (i10 == i11) {
                                hVar = null;
                                break;
                            }
                            i10 += i12;
                        } else {
                            hVar = new jc.h(Integer.valueOf(i10), str3);
                            break;
                        }
                    }
                } else {
                    hVar = null;
                    break;
                }
            } else {
                int i13 = cVar.f3515c;
                int i14 = cVar.f3516d;
                int i15 = cVar.f3517e;
                if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                    while (true) {
                        Iterator<T> it2 = list.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                            str2 = (String) next2;
                        } while (!q.l(str2, 0, (String) charSequence2, i13, str2.length(), z10));
                        String str4 = (String) next2;
                        if (str4 == null) {
                            if (i13 == i14) {
                                hVar = null;
                                break;
                            }
                            i13 += i15;
                        } else {
                            hVar = new jc.h(Integer.valueOf(i13), str4);
                            break;
                        }
                    }
                } else {
                    hVar = null;
                    break;
                }
            }
        } else {
            j0.i(list, "<this>");
            j0.i(list, "<this>");
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size != 1) {
                throw new IllegalArgumentException("List has more than one element.");
            }
            String str5 = list.get(0);
            int iE = u.E(charSequence2, str5, iIntValue, false, 4);
            if (iE < 0) {
                hVar = null;
                break;
            }
            hVar = new jc.h(Integer.valueOf(iE), str5);
        }
        if (hVar != null) {
            return new jc.h<>(hVar.f31811c, Integer.valueOf(((String) hVar.f31812d).length()));
        }
        return null;
    }
}
