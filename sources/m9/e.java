package m9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends ViewGroup {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f33332c = new a(null);

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0042  */
        /* JADX WARN: Code duplicated, block: B:41:0x0058 A[PHI: r11
  0x0058: PHI (r11v3 int) = (r11v0 int), (r11v0 int), (r11v0 int), (r11v9 int) binds: [B:40:0x0056, B:24:0x003d, B:11:0x0027, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:48:0x0064  */
        /* JADX WARN: Code duplicated, block: B:50:0x0068  */
        /* JADX WARN: Code duplicated, block: B:51:0x0071  */
        public final int a(int i10, int i11, int i12, int i13, int i14) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10) - i11;
            int i15 = 0;
            int iMax = Math.max(0, size);
            boolean z10 = true;
            if (mode == Integer.MIN_VALUE) {
                if (i12 >= 0 && i12 <= Integer.MAX_VALUE) {
                    i15 = 1073741824;
                } else {
                    if (i12 == -1) {
                        i12 = iMax;
                    } else if (i12 == -2) {
                        if (i14 == Integer.MAX_VALUE) {
                            i12 = iMax;
                        } else {
                            i12 = i14;
                        }
                    } else if (i12 == -3) {
                        i12 = Math.min(Math.max(iMax, i13), i14);
                    } else {
                        i12 = 0;
                    }
                    i15 = Integer.MIN_VALUE;
                }
            } else if (mode != 0) {
                if (mode == 1073741824) {
                    if (!(i12 >= 0 && i12 <= Integer.MAX_VALUE)) {
                        if (i12 == -1) {
                            i12 = iMax;
                        } else if (i12 == -2) {
                            if (i14 == Integer.MAX_VALUE) {
                                i12 = iMax;
                            } else {
                                i12 = i14;
                                i15 = Integer.MIN_VALUE;
                            }
                        } else if (i12 == -3) {
                            i12 = Math.min(Math.max(iMax, i13), i14);
                            i15 = Integer.MIN_VALUE;
                        }
                    }
                    i15 = 1073741824;
                }
                i12 = 0;
            } else {
                if (i12 >= 0 && i12 <= Integer.MAX_VALUE) {
                    i15 = 1073741824;
                } else {
                    if (i12 != -1) {
                        if (i12 != -2 && i12 != -3) {
                            z10 = false;
                        }
                        if (!z10) {
                            i12 = 0;
                        } else if (i14 != Integer.MAX_VALUE) {
                            i12 = i14;
                            i15 = Integer.MIN_VALUE;
                        }
                    }
                    i12 = iMax;
                }
            }
            return View.MeasureSpec.makeMeasureSpec(i12, i15);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        setClipToPadding(false);
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i10, int i11, vc.g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            return new d((d) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i10, int i11) {
        j0.i(view, "child");
        a aVar = f33332c;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        d dVar = (d) layoutParams;
        view.measure(aVar.a(i10, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) dVar).width, view.getMinimumWidth(), dVar.f33331h), aVar.a(i11, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) dVar).height, view.getMinimumHeight(), dVar.f33330g));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        j0.i(view, "child");
        a aVar = f33332c;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        d dVar = (d) layoutParams;
        view.measure(aVar.a(i10, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin + i11, ((ViewGroup.MarginLayoutParams) dVar).width, view.getMinimumWidth(), dVar.f33331h), aVar.a(i12, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) dVar).height, view.getMinimumHeight(), dVar.f33330g));
    }
}
