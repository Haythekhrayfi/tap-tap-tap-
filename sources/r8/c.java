package r8;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import jc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35297a;

        static {
            int[] iArr = new int[r8.a.values().length];
            iArr[r8.a.PREVIOUS.ordinal()] = 1;
            iArr[r8.a.NEXT.ordinal()] = 2;
            f35297a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    public static final int a(RecyclerView recyclerView, r8.a aVar) {
        int iFindFirstCompletelyVisibleItemPosition;
        boolean zCanScrollVertically;
        int iFindLastVisibleItemPosition;
        LinearLayoutManager linearLayoutManagerB = b(recyclerView);
        if (linearLayoutManagerB == null) {
            iFindFirstCompletelyVisibleItemPosition = -1;
        } else {
            int i10 = a.f35297a[aVar.ordinal()];
            if (i10 == 1) {
                iFindFirstCompletelyVisibleItemPosition = linearLayoutManagerB.findFirstCompletelyVisibleItemPosition();
            } else {
                if (i10 != 2) {
                    throw new g();
                }
                LinearLayoutManager linearLayoutManagerB2 = b(recyclerView);
                Integer numValueOf = linearLayoutManagerB2 == null ? null : Integer.valueOf(linearLayoutManagerB2.getOrientation());
                if (numValueOf != null && numValueOf.intValue() == 0) {
                    zCanScrollVertically = recyclerView.canScrollHorizontally(1);
                } else {
                    zCanScrollVertically = (numValueOf != null && numValueOf.intValue() == 1) ? recyclerView.canScrollVertically(1) : false;
                }
                if (zCanScrollVertically) {
                    iFindFirstCompletelyVisibleItemPosition = linearLayoutManagerB.findFirstCompletelyVisibleItemPosition();
                } else {
                    iFindFirstCompletelyVisibleItemPosition = linearLayoutManagerB.findLastCompletelyVisibleItemPosition();
                }
            }
        }
        Integer numValueOf2 = Integer.valueOf(iFindFirstCompletelyVisibleItemPosition);
        Integer num = numValueOf2.intValue() != -1 ? numValueOf2 : null;
        if (num != null) {
            return num.intValue();
        }
        LinearLayoutManager linearLayoutManagerB3 = b(recyclerView);
        if (linearLayoutManagerB3 == null) {
            return -1;
        }
        int i11 = a.f35297a[aVar.ordinal()];
        if (i11 == 1) {
            iFindLastVisibleItemPosition = linearLayoutManagerB3.findLastVisibleItemPosition();
        } else {
            if (i11 != 2) {
                throw new g();
            }
            iFindLastVisibleItemPosition = linearLayoutManagerB3.findFirstVisibleItemPosition();
        }
        return iFindLastVisibleItemPosition;
    }

    public static final <T extends RecyclerView> LinearLayoutManager b(T t10) {
        RecyclerView.o layoutManager = t10.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }
}
