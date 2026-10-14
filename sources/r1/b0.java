package r1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends l {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    public static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    public class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f35036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f35037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f35038c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.f35036a = viewGroup;
            this.f35037b = view;
            this.f35038c = view2;
        }

        @Override // r1.m, r1.l.g
        public void onTransitionEnd(l lVar) {
            this.f35038c.setTag(R.id.save_overlay_view, null);
            this.f35036a.getOverlay().remove(this.f35037b);
            lVar.removeListener(this);
        }

        @Override // r1.m, r1.l.g
        public void onTransitionPause(l lVar) {
            this.f35036a.getOverlay().remove(this.f35037b);
        }

        @Override // r1.m, r1.l.g
        public void onTransitionResume(l lVar) {
            if (this.f35037b.getParent() == null) {
                this.f35036a.getOverlay().add(this.f35037b);
            } else {
                b0.this.cancel();
            }
        }
    }

    public static class b extends AnimatorListenerAdapter implements l.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f35040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ViewGroup f35042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f35043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f35044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f35045f = false;

        public b(View view, int i10, boolean z10) {
            this.f35040a = view;
            this.f35041b = i10;
            this.f35042c = (ViewGroup) view.getParent();
            this.f35043d = z10;
            b(true);
        }

        public final void a() {
            if (!this.f35045f) {
                u.f35140a.f(this.f35040a, this.f35041b);
                ViewGroup viewGroup = this.f35042c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }

        public final void b(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f35043d || this.f35044e == z10 || (viewGroup = this.f35042c) == null) {
                return;
            }
            this.f35044e = z10;
            t.a(viewGroup, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f35045f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f35045f) {
                return;
            }
            u.f35140a.f(this.f35040a, this.f35041b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f35045f) {
                return;
            }
            u.f35140a.f(this.f35040a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // r1.l.g
        public void onTransitionCancel(l lVar) {
        }

        @Override // r1.l.g
        public void onTransitionEnd(l lVar) {
            a();
            lVar.removeListener(this);
        }

        @Override // r1.l.g
        public void onTransitionPause(l lVar) {
            b(false);
        }

        @Override // r1.l.g
        public void onTransitionResume(l lVar) {
            b(true);
        }

        @Override // r1.l.g
        public void onTransitionStart(l lVar) {
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f35046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f35047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f35048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f35049d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f35050e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ViewGroup f35051f;
    }

    public b0() {
        this.mMode = 3;
    }

    @SuppressLint({"RestrictedApi"})
    public b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f35102c);
        int iD = g0.j.d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iD != 0) {
            setMode(iD);
        }
    }

    private void captureValues(r rVar) {
        rVar.f35132a.put(PROPNAME_VISIBILITY, Integer.valueOf(rVar.f35133b.getVisibility()));
        rVar.f35132a.put(PROPNAME_PARENT, rVar.f35133b.getParent());
        int[] iArr = new int[2];
        rVar.f35133b.getLocationOnScreen(iArr);
        rVar.f35132a.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r9 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r0.f35050e == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r0.f35048c == 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private r1.b0.c getVisibilityChangeInfo(r1.r r8, r1.r r9) {
        /*
            r7 = this;
            r1.b0$c r0 = new r1.b0$c
            r0.<init>()
            r1 = 0
            r0.f35046a = r1
            r0.f35047b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f35132a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f35132a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f35048c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f35132a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f35050e = r6
            goto L37
        L33:
            r0.f35048c = r4
            r0.f35050e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f35132a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f35132a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f35049d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f35132a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f35051f = r2
            goto L5e
        L5a:
            r0.f35049d = r4
            r0.f35051f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f35048c
            int r9 = r0.f35049d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f35050e
            android.view.ViewGroup r4 = r0.f35051f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f35051f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f35050e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f35049d
            if (r8 != 0) goto L8d
        L88:
            r0.f35047b = r2
        L8a:
            r0.f35046a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f35048c
            if (r8 != 0) goto L96
        L93:
            r0.f35047b = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.b0.getVisibilityChangeInfo(r1.r, r1.r):r1.b0$c");
    }

    @Override // r1.l
    public void captureEndValues(r rVar) {
        captureValues(rVar);
    }

    @Override // r1.l
    public void captureStartValues(r rVar) {
        captureValues(rVar);
    }

    @Override // r1.l
    public Animator createAnimator(ViewGroup viewGroup, r rVar, r rVar2) {
        c visibilityChangeInfo = getVisibilityChangeInfo(rVar, rVar2);
        if (!visibilityChangeInfo.f35046a) {
            return null;
        }
        if (visibilityChangeInfo.f35050e == null && visibilityChangeInfo.f35051f == null) {
            return null;
        }
        return visibilityChangeInfo.f35047b ? onAppear(viewGroup, rVar, visibilityChangeInfo.f35048c, rVar2, visibilityChangeInfo.f35049d) : onDisappear(viewGroup, rVar, visibilityChangeInfo.f35048c, rVar2, visibilityChangeInfo.f35049d);
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // r1.l
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // r1.l
    public boolean isTransitionRequired(r rVar, r rVar2) {
        if (rVar == null && rVar2 == null) {
            return false;
        }
        if (rVar != null && rVar2 != null && rVar2.f35132a.containsKey(PROPNAME_VISIBILITY) != rVar.f35132a.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        c visibilityChangeInfo = getVisibilityChangeInfo(rVar, rVar2);
        if (visibilityChangeInfo.f35046a) {
            return visibilityChangeInfo.f35048c == 0 || visibilityChangeInfo.f35049d == 0;
        }
        return false;
    }

    public boolean isVisible(r rVar) {
        if (rVar == null) {
            return false;
        }
        return ((Integer) rVar.f35132a.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) rVar.f35132a.get(PROPNAME_PARENT)) != null;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        return null;
    }

    public Animator onAppear(ViewGroup viewGroup, r rVar, int i10, r rVar2, int i11) {
        if ((this.mMode & 1) != 1 || rVar2 == null) {
            return null;
        }
        if (rVar == null) {
            View view = (View) rVar2.f35133b.getParent();
            if (getVisibilityChangeInfo(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f35046a) {
                return null;
            }
        }
        return onAppear(viewGroup, rVar2.f35133b, rVar, rVar2);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:58:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x017c  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b7  */
    public Animator onDisappear(ViewGroup viewGroup, r rVar, int i10, r rVar2, int i11) {
        boolean z10;
        View view;
        boolean z11;
        boolean zIsAttachedToWindow;
        boolean z12;
        int i12;
        ViewGroup viewGroup2;
        int iRound;
        Bitmap bitmapCreateBitmap;
        b0 b0Var = this;
        if ((b0Var.mMode & 2) != 2 || rVar == null) {
            return null;
        }
        View view2 = rVar.f35133b;
        View view3 = rVar2 != null ? rVar2.f35133b : null;
        View view4 = (View) view2.getTag(R.id.save_overlay_view);
        boolean z13 = true;
        if (view4 != null) {
            view = null;
        } else {
            if (view3 == null || view3.getParent() == null) {
                if (view3 != null) {
                    view4 = view3;
                    z10 = false;
                    view3 = null;
                } else {
                    view3 = null;
                    view4 = null;
                    z10 = true;
                }
            } else if (i11 == 4 || view2 == view3) {
                view4 = null;
                z10 = false;
            } else {
                view3 = null;
                view4 = null;
                z10 = true;
            }
            if (z10) {
                if (view2.getParent() == null) {
                    view3 = view3;
                } else if (view2.getParent() instanceof View) {
                    View view5 = (View) view2.getParent();
                    if (b0Var.getVisibilityChangeInfo(b0Var.getTransitionValues(view5, true), b0Var.getMatchedTransitionValues(view5, true)).f35046a) {
                        view3 = view3;
                        int id2 = view5.getId();
                        if (view5.getParent() != null || id2 == -1 || viewGroup.findViewById(id2) == null) {
                            b0Var = this;
                        } else {
                            b0Var = this;
                            if (b0Var.mCanRemoveViews) {
                            }
                        }
                    } else {
                        boolean z14 = q.f35129a;
                        Matrix matrix = new Matrix();
                        matrix.setTranslate(-view5.getScrollX(), -view5.getScrollY());
                        a0 a0Var = u.f35140a;
                        a0Var.g(view2, matrix);
                        a0Var.h(viewGroup, matrix);
                        RectF rectF = new RectF(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, view2.getWidth(), view2.getHeight());
                        matrix.mapRect(rectF);
                        int iRound2 = Math.round(rectF.left);
                        int iRound3 = Math.round(rectF.top);
                        int iRound4 = Math.round(rectF.right);
                        int iRound5 = Math.round(rectF.bottom);
                        ImageView imageView = new ImageView(view2.getContext());
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        if (q.f35129a) {
                            z11 = !view2.isAttachedToWindow();
                            if (viewGroup != null) {
                                zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                            }
                            z12 = q.f35130b;
                            if (z12 || !z11) {
                                i12 = 0;
                                viewGroup2 = null;
                            } else {
                                if (zIsAttachedToWindow) {
                                    viewGroup2 = (ViewGroup) view2.getParent();
                                    int iIndexOfChild = viewGroup2.indexOfChild(view2);
                                    viewGroup.getOverlay().add(view2);
                                    i12 = iIndexOfChild;
                                } else {
                                    view3 = view3;
                                    bitmapCreateBitmap = null;
                                }
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                b0Var = this;
                                view4 = imageView;
                            }
                            iRound = Math.round(rectF.width());
                            int iRound6 = Math.round(rectF.height());
                            if (iRound > 0 || iRound6 <= 0) {
                                bitmapCreateBitmap = null;
                            } else {
                                float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound6));
                                int iRound7 = Math.round(iRound * fMin);
                                int iRound8 = Math.round(iRound6 * fMin);
                                matrix.postTranslate(-rectF.left, -rectF.top);
                                matrix.postScale(fMin, fMin);
                                if (q.f35131c) {
                                    Picture picture = new Picture();
                                    Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                    canvasBeginRecording.concat(matrix);
                                    view2.draw(canvasBeginRecording);
                                    picture.endRecording();
                                    bitmapCreateBitmap = Bitmap.createBitmap(picture);
                                } else {
                                    bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                                    canvas.concat(matrix);
                                    view2.draw(canvas);
                                }
                            }
                            if (z12 && z11) {
                                viewGroup.getOverlay().remove(view2);
                                viewGroup2.addView(view2, i12);
                            }
                            if (bitmapCreateBitmap != null) {
                                imageView.setImageBitmap(bitmapCreateBitmap);
                            }
                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                            imageView.layout(iRound2, iRound3, iRound4, iRound5);
                            b0Var = this;
                            view4 = imageView;
                        } else {
                            z11 = false;
                        }
                        zIsAttachedToWindow = false;
                        z12 = q.f35130b;
                        if (z12) {
                            i12 = 0;
                            viewGroup2 = null;
                            iRound = Math.round(rectF.width());
                            int iRound9 = Math.round(rectF.height());
                            if (iRound > 0) {
                                bitmapCreateBitmap = null;
                            } else {
                                bitmapCreateBitmap = null;
                            }
                            if (z12) {
                                viewGroup.getOverlay().remove(view2);
                                viewGroup2.addView(view2, i12);
                            }
                        } else {
                            i12 = 0;
                            viewGroup2 = null;
                            iRound = Math.round(rectF.width());
                            int iRound10 = Math.round(rectF.height());
                            if (iRound > 0) {
                                bitmapCreateBitmap = null;
                            } else {
                                bitmapCreateBitmap = null;
                            }
                            if (z12) {
                                viewGroup.getOverlay().remove(view2);
                                viewGroup2.addView(view2, i12);
                            }
                        }
                        if (bitmapCreateBitmap != null) {
                            imageView.setImageBitmap(bitmapCreateBitmap);
                        }
                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                        imageView.layout(iRound2, iRound3, iRound4, iRound5);
                        b0Var = this;
                        view4 = imageView;
                    }
                } else {
                    view3 = view3;
                }
                view4 = view2;
            } else {
                view3 = view3;
            }
            view = view3;
            z13 = false;
        }
        if (view4 == null) {
            if (view == null) {
                return null;
            }
            int visibility = view.getVisibility();
            a0 a0Var2 = u.f35140a;
            a0Var2.f(view, 0);
            Animator animatorOnDisappear = b0Var.onDisappear(viewGroup, view, rVar, rVar2);
            if (animatorOnDisappear != null) {
                b bVar = new b(view, i11, true);
                animatorOnDisappear.addListener(bVar);
                animatorOnDisappear.addPauseListener(bVar);
                b0Var.addListener(bVar);
            } else {
                a0Var2.f(view, visibility);
            }
            return animatorOnDisappear;
        }
        if (!z13) {
            int[] iArr = (int[]) rVar.f35132a.get(PROPNAME_SCREEN_LOCATION);
            int i13 = iArr[0];
            int i14 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i13 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i14 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorOnDisappear2 = b0Var.onDisappear(viewGroup, view4, rVar, rVar2);
        if (!z13) {
            if (animatorOnDisappear2 == null) {
                viewGroup.getOverlay().remove(view4);
            } else {
                view2.setTag(R.id.save_overlay_view, view4);
                b0Var.addListener(b0Var.new a(viewGroup, view4, view2));
            }
        }
        return animatorOnDisappear2;
    }

    public void setMode(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i10;
    }
}
