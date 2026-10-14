package androidx.viewpager2.widget;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;
import java.util.Locale;
import java.util.Objects;
import l8.n3;
import l8.o3;
import o8.l;
import y9.r4;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ViewPager2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayoutManager f3053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager2.i f3054b;

    public e(LinearLayoutManager linearLayoutManager) {
        this.f3053a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void onPageScrollStateChanged(int i10) {
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:58:0x0126  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0135  */
    /* JADX WARN: Code duplicated, block: B:69:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0152  */
    /* JADX WARN: Code duplicated, block: B:79:0x0156  */
    /* JADX WARN: Code duplicated, block: B:82:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0162  */
    /* JADX WARN: Code duplicated, block: B:87:0x016a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Code duplicated, block: B:94:0x0189  */
    /* JADX WARN: Code duplicated, block: B:95:0x018f  */
    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void onPageScrolled(int i10, float f10, int i11) {
        View view;
        boolean z10;
        boolean z11;
        boolean z12;
        float fC;
        float f11;
        float f12;
        int height;
        e eVar = this;
        if (eVar.f3054b == null) {
            return;
        }
        float f13 = -f10;
        int i12 = 0;
        while (i12 < eVar.f3053a.getChildCount()) {
            View childAt = eVar.f3053a.getChildAt(i12);
            if (childAt == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i12), Integer.valueOf(this.f3053a.getChildCount())));
            }
            float position = (eVar.f3053a.getPosition(childAt) - i10) + f13;
            n3 n3Var = (n3) eVar.f3054b;
            o3 o3Var = n3Var.f32640a;
            r4 r4Var = n3Var.f32641b;
            l lVar = n3Var.f32642c;
            v9.d dVar = n3Var.f32643d;
            Integer num = n3Var.f32644e;
            r4.f fVar = n3Var.f32645f;
            float f14 = n3Var.f32646g;
            float f15 = n3Var.f32647h;
            float f16 = n3Var.f32648i;
            SparseArray sparseArray = n3Var.f32649j;
            j0.i(o3Var, "this$0");
            j0.i(r4Var, "$div");
            j0.i(lVar, "$view");
            j0.i(dVar, "$resolver");
            j0.i(fVar, "$orientation");
            j0.i(sparseArray, "$pageTranslations");
            j0.i(childAt, "page");
            ViewParent parent = childAt.getParent().getParent();
            float f17 = f13;
            Objects.requireNonNull(parent, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
            View childAt2 = ((ViewPager2) parent).getChildAt(0);
            Objects.requireNonNull(childAt2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) childAt2;
            RecyclerView.g adapter = recyclerView.getAdapter();
            boolean z13 = adapter != null && adapter.getItemCount() == 2;
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            Integer numValueOf = layoutManager == null ? null : Integer.valueOf(layoutManager.getPosition(childAt));
            boolean z14 = numValueOf != null && numValueOf.intValue() == 0;
            int i13 = i12;
            if (numValueOf == null) {
                view = childAt;
            } else {
                view = childAt;
                z10 = numValueOf.intValue() == 1;
                RecyclerView.g adapter2 = recyclerView.getAdapter();
                j0.f(adapter2);
                int itemCount = adapter2.getItemCount() - 2;
                if (numValueOf == null && numValueOf.intValue() == itemCount) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                RecyclerView.g adapter3 = recyclerView.getAdapter();
                j0.f(adapter3);
                int itemCount2 = adapter3.getItemCount() - 1;
                if (numValueOf == null && numValueOf.intValue() == itemCount2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                fC = o3Var.c(r4Var, lVar, dVar);
                if (num != null) {
                    if (fVar == r4.f.HORIZONTAL) {
                        height = lVar.getViewPager().getWidth();
                    } else {
                        height = lVar.getViewPager().getHeight();
                    }
                    float f18 = 2;
                    fC = (((1 - (num.intValue() / 100.0f)) * height) - (f14 * f18)) / f18;
                }
                f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                if (!z13) {
                    if (!z14 && position < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && position >= -1.0f) {
                        f11 = (fC + f14) - f15;
                    } else if (!z14 && position < -1.0f) {
                        f11 = ((fC + f14) - f15) / (-position);
                    } else if (!z10 && position > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        f11 = (fC + f14) - f15;
                    } else if (!z11 && position < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        f11 = (fC + f14) - f16;
                    } else if (!z12 && position > 1.0f) {
                        f11 = ((fC + f14) - f16) / position;
                    } else if (z12 && position > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && position <= 1.0f) {
                        f11 = (fC + f14) - f16;
                    }
                }
                f12 = ((fC * 2) + f14 + f11) * (-position);
                if (numValueOf != null) {
                    sparseArray.put(numValueOf.intValue(), Float.valueOf(f12));
                }
                if (fVar == r4.f.HORIZONTAL) {
                    view.setTranslationX(f12);
                } else {
                    view.setTranslationY(f12);
                }
                i12 = i13 + 1;
                eVar = this;
                f13 = f17;
            }
            RecyclerView.g adapter4 = recyclerView.getAdapter();
            j0.f(adapter4);
            int itemCount3 = adapter4.getItemCount() - 2;
            if (numValueOf == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            RecyclerView.g adapter5 = recyclerView.getAdapter();
            j0.f(adapter5);
            int itemCount4 = adapter5.getItemCount() - 1;
            if (numValueOf == null) {
                z12 = false;
            } else {
                z12 = true;
            }
            fC = o3Var.c(r4Var, lVar, dVar);
            if (num != null) {
                if (fVar == r4.f.HORIZONTAL) {
                    height = lVar.getViewPager().getWidth();
                } else {
                    height = lVar.getViewPager().getHeight();
                }
                float f19 = 2;
                fC = (((1 - (num.intValue() / 100.0f)) * height) - (f14 * f19)) / f19;
            }
            f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            if (!z13) {
                if (!z14) {
                    if (!z14) {
                        if (!z10) {
                        }
                        if (!z11) {
                            if (!z12) {
                                if (z12) {
                                    f11 = (fC + f14) - f16;
                                }
                            } else if (z12) {
                                f11 = (fC + f14) - f16;
                            }
                        } else if (!z12) {
                            if (z12) {
                                f11 = (fC + f14) - f16;
                            }
                        } else if (z12) {
                            f11 = (fC + f14) - f16;
                        }
                    } else {
                        if (!z10) {
                        }
                        if (!z11) {
                            if (!z12) {
                                if (z12) {
                                    f11 = (fC + f14) - f16;
                                }
                            } else if (z12) {
                                f11 = (fC + f14) - f16;
                            }
                        } else if (!z12) {
                            if (z12) {
                                f11 = (fC + f14) - f16;
                            }
                        } else if (z12) {
                            f11 = (fC + f14) - f16;
                        }
                    }
                } else if (!z14) {
                    if (!z10) {
                    }
                    if (!z11) {
                        if (!z12) {
                            if (z12) {
                                f11 = (fC + f14) - f16;
                            }
                        } else if (z12) {
                            f11 = (fC + f14) - f16;
                        }
                    } else if (!z12) {
                        if (z12) {
                            f11 = (fC + f14) - f16;
                        }
                    } else if (z12) {
                        f11 = (fC + f14) - f16;
                    }
                } else {
                    if (!z10) {
                    }
                    if (!z11) {
                        if (!z12) {
                            if (z12) {
                                f11 = (fC + f14) - f16;
                            }
                        } else if (z12) {
                            f11 = (fC + f14) - f16;
                        }
                    } else if (!z12) {
                        if (z12) {
                            f11 = (fC + f14) - f16;
                        }
                    } else if (z12) {
                        f11 = (fC + f14) - f16;
                    }
                }
            }
            f12 = ((fC * 2) + f14 + f11) * (-position);
            if (numValueOf != null) {
                sparseArray.put(numValueOf.intValue(), Float.valueOf(f12));
            }
            if (fVar == r4.f.HORIZONTAL) {
                view.setTranslationX(f12);
            } else {
                view.setTranslationY(f12);
            }
            i12 = i13 + 1;
            eVar = this;
            f13 = f17;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void onPageSelected(int i10) {
    }
}
