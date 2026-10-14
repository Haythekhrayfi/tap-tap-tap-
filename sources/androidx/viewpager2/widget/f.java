package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f extends RecyclerView.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager2.g f3055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPager2 f3056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f3057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f3058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f3061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3067m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f3069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3070c;

        public void a() {
            this.f3068a = -1;
            this.f3069b = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            this.f3070c = 0;
        }
    }

    public f(ViewPager2 viewPager2) {
        this.f3056b = viewPager2;
        RecyclerView recyclerView = viewPager2.f3018l;
        this.f3057c = recyclerView;
        this.f3058d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f3061g = new a();
        c();
    }

    public final void a(int i10) {
        ViewPager2.g gVar = this.f3055a;
        if (gVar != null) {
            gVar.onPageSelected(i10);
        }
    }

    public final void b(int i10) {
        if ((this.f3059e == 3 && this.f3060f == 0) || this.f3060f == i10) {
            return;
        }
        this.f3060f = i10;
        ViewPager2.g gVar = this.f3055a;
        if (gVar != null) {
            gVar.onPageScrollStateChanged(i10);
        }
    }

    public final void c() {
        this.f3059e = 0;
        this.f3060f = 0;
        this.f3061g.a();
        this.f3062h = -1;
        this.f3063i = -1;
        this.f3064j = false;
        this.f3065k = false;
        this.f3067m = false;
        this.f3066l = false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:0x0160  */
    public final void d() {
        int top;
        boolean z10;
        boolean z11;
        boolean z12;
        int top2;
        int i10;
        int bottom;
        int i11;
        a aVar = this.f3061g;
        int iFindFirstVisibleItemPosition = this.f3058d.findFirstVisibleItemPosition();
        aVar.f3068a = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            aVar.a();
            return;
        }
        View viewFindViewByPosition = this.f3058d.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            aVar.a();
            return;
        }
        int leftDecorationWidth = this.f3058d.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.f3058d.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.f3058d.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.f3058d.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f3058d.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.f3057c.getPaddingLeft();
            if (this.f3056b.b()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.f3057c.getPaddingTop();
        }
        int i12 = -top;
        aVar.f3070c = i12;
        if (i12 >= 0) {
            aVar.f3069b = height == 0 ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : i12 / height;
            return;
        }
        LinearLayoutManager linearLayoutManager = this.f3058d;
        b bVar = new b(linearLayoutManager);
        int childCount = linearLayoutManager.getChildCount();
        if (childCount != 0) {
            boolean z13 = bVar.f3048a.getOrientation() == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, childCount, 2);
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = bVar.f3048a.getChildAt(i13);
                if (childAt == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : b.f3047b;
                int[] iArr2 = iArr[i13];
                if (z13) {
                    top2 = childAt.getLeft();
                    i10 = marginLayoutParams2.leftMargin;
                } else {
                    top2 = childAt.getTop();
                    i10 = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i10;
                int[] iArr3 = iArr[i13];
                if (z13) {
                    bottom = childAt.getRight();
                    i11 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i11 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i11;
            }
            Arrays.sort(iArr, new androidx.viewpager2.widget.a(bVar));
            int i14 = 1;
            while (true) {
                if (i14 >= childCount) {
                    int i15 = iArr[0][1] - iArr[0][0];
                    if (iArr[0][0] <= 0 && iArr[childCount - 1][1] >= i15) {
                        z10 = true;
                    }
                } else if (iArr[i14 - 1][1] == iArr[i14][0]) {
                    i14++;
                }
                z10 = false;
            }
        } else {
            z10 = true;
        }
        if (!z10 || bVar.f3048a.getChildCount() <= 1) {
            int childCount2 = bVar.f3048a.getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 >= childCount2) {
                    z11 = false;
                    break;
                } else {
                    if (b.a(bVar.f3048a.getChildAt(i16))) {
                        z11 = true;
                        break;
                    }
                    i16++;
                }
            }
            if (z11) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        if (!z12) {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f3070c)));
        }
        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        ViewPager2.g gVar;
        int i11 = this.f3059e;
        boolean z10 = true;
        if (!(i11 == 1 && this.f3060f == 1) && i10 == 1) {
            this.f3067m = false;
            this.f3059e = 1;
            int i12 = this.f3063i;
            if (i12 != -1) {
                this.f3062h = i12;
                this.f3063i = -1;
            } else if (this.f3062h == -1) {
                this.f3062h = this.f3058d.findFirstVisibleItemPosition();
            }
            b(1);
            return;
        }
        if ((i11 == 1 || i11 == 4) && i10 == 2) {
            if (this.f3065k) {
                b(2);
                this.f3064j = true;
                return;
            }
            return;
        }
        if ((i11 == 1 || i11 == 4) && i10 == 0) {
            d();
            if (this.f3065k) {
                a aVar = this.f3061g;
                if (aVar.f3070c == 0) {
                    int i13 = this.f3062h;
                    int i14 = aVar.f3068a;
                    if (i13 != i14) {
                        a(i14);
                    }
                } else {
                    z10 = false;
                }
            } else {
                int i15 = this.f3061g.f3068a;
                if (i15 != -1 && (gVar = this.f3055a) != null) {
                    gVar.onPageScrolled(i15, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0);
                }
            }
            if (z10) {
                b(0);
                c();
            }
        }
        if (this.f3059e == 2 && i10 == 0 && this.f3066l) {
            d();
            a aVar2 = this.f3061g;
            if (aVar2.f3070c == 0) {
                int i16 = this.f3063i;
                int i17 = aVar2.f3068a;
                if (i16 != i17) {
                    if (i17 == -1) {
                        i17 = 0;
                    }
                    a(i17);
                }
                b(0);
                c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        this.f3065k = true;
        d();
        if (this.f3064j) {
            this.f3064j = false;
            if (i11 > 0) {
                z10 = true;
            } else {
                if (i11 == 0) {
                    if ((i10 < 0) == this.f3056b.b()) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            if (z10) {
                a aVar = this.f3061g;
                if (aVar.f3070c != 0) {
                    i12 = aVar.f3068a + 1;
                } else {
                    i12 = this.f3061g.f3068a;
                }
            } else {
                i12 = this.f3061g.f3068a;
            }
            this.f3063i = i12;
            if (this.f3062h != i12) {
                a(i12);
            }
        } else if (this.f3059e == 0) {
            i12 = this.f3061g.f3068a;
            if (i12 == -1) {
                i12 = 0;
            }
            a(i12);
        }
        a aVar2 = this.f3061g;
        int i13 = aVar2.f3068a;
        if (i13 == -1) {
            i13 = 0;
        }
        float f10 = aVar2.f3069b;
        int i14 = aVar2.f3070c;
        ViewPager2.g gVar = this.f3055a;
        if (gVar != null) {
            gVar.onPageScrolled(i13, f10, i14);
        }
        a aVar3 = this.f3061g;
        int i15 = aVar3.f3068a;
        int i16 = this.f3063i;
        if ((i15 == i16 || i16 == -1) && aVar3.f3070c == 0 && this.f3060f != 1) {
            b(0);
            c();
        }
    }
}
