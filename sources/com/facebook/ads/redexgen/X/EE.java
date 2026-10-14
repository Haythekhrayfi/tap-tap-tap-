package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EE extends AbstractC1351Yk {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"K3xavpXOVVnTPS8V8FmisIpuez1NdmFn", "QjoCrUVtXYT15qNhmppxWCsnlOvXMRWn", "HVYav4KnfeU3lAWSFDiSVAYelCZD7hW1", "SKhwmHHGUoQzTLK2kw5WKB1efbL3jYLm", "aZpNXGptJoOcjVlsPlgA0RFw1bcc4fI1", "y8DDj9eTKGlZyxtiH83YwnquX80t2qUq", "Eqht3urb", "PkOCx2w9GPXTa0iGANdHxOJetOGxrMw0"};
    public ArrayList<AbstractC06224s> A0A = new ArrayList<>();
    public ArrayList<AbstractC06224s> A07 = new ArrayList<>();
    public ArrayList<AnonymousClass48> A09 = new ArrayList<>();
    public ArrayList<AnonymousClass47> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC06224s>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<AnonymousClass48>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<AnonymousClass47>> A03 = new ArrayList<>();
    public ArrayList<AbstractC06224s> A00 = new ArrayList<>();
    public ArrayList<AbstractC06224s> A04 = new ArrayList<>();
    public ArrayList<AbstractC06224s> A06 = new ArrayList<>();
    public ArrayList<AbstractC06224s> A02 = new ArrayList<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.C4W
    public final void A0I() {
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            AnonymousClass48 anonymousClass48 = this.A09.get(size);
            View view = anonymousClass48.A04.A0H;
            view.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            view.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            A0O(anonymousClass48.A04);
            this.A09.remove(size);
        }
        for (int size2 = this.A0A.size() - 1; size2 >= 0; size2--) {
            A0P(this.A0A.get(size2));
            this.A0A.remove(size2);
        }
        for (int size3 = this.A07.size() - 1; size3 >= 0; size3--) {
            AbstractC06224s abstractC06224s = this.A07.get(size3);
            abstractC06224s.A0H.setAlpha(1.0f);
            A0N(abstractC06224s);
            this.A07.remove(size3);
        }
        for (int size4 = this.A08.size() - 1; size4 >= 0; size4--) {
            A01(this.A08.get(size4));
        }
        this.A08.clear();
        if (A0L()) {
            for (int size5 = this.A05.size() - 1; size5 >= 0; size5--) {
                ArrayList<AnonymousClass48> arrayList = this.A05.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    AnonymousClass48 anonymousClass49 = arrayList.get(size6);
                    View view2 = anonymousClass49.A04.A0H;
                    view2.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    view2.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    A0O(anonymousClass49.A04);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.A05.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.A01.size() - 1; size7 >= 0; size7--) {
                ArrayList<AbstractC06224s> arrayList2 = this.A01.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    AbstractC06224s abstractC06224s2 = arrayList2.get(size8);
                    abstractC06224s2.A0H.setAlpha(1.0f);
                    A0N(abstractC06224s2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.A01.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.A03.size() - 1; size9 >= 0; size9--) {
                ArrayList<AnonymousClass47> arrayList3 = this.A03.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    A01(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.A03.remove(arrayList3);
                    }
                }
            }
            A05(this.A06);
            A05(this.A04);
            A05(this.A00);
            A05(this.A02);
            A0A();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC1351Yk
    public final boolean A0T(AbstractC06224s abstractC06224s, int i10, int i11, int i12, int i13) {
        View view = abstractC06224s.A0H;
        int translationX = i10 + ((int) abstractC06224s.A0H.getTranslationX());
        int translationY = i11 + ((int) abstractC06224s.A0H.getTranslationY());
        A04(abstractC06224s);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            A0O(abstractC06224s);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.A09.add(new AnonymousClass48(abstractC06224s, translationX, translationY, i12, i13));
        return true;
    }

    private void A01(AnonymousClass47 anonymousClass47) {
        if (anonymousClass47.A05 != null) {
            A07(anonymousClass47, anonymousClass47.A05);
        }
        if (anonymousClass47.A04 != null) {
            A07(anonymousClass47, anonymousClass47.A04);
        }
    }

    private void A03(final AbstractC06224s abstractC06224s) {
        final View view = abstractC06224s.A0H;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A06.add(abstractC06224s);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.setDuration(A07());
        animation.alpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.42
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                view.setAlpha(1.0f);
                this.A02.A0P(abstractC06224s);
                this.A02.A06.remove(abstractC06224s);
                this.A02.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    private void A04(AbstractC06224s abstractC06224s) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC06224s.A0H.animate().setInterpolator(A0B);
        A0K(abstractC06224s);
    }

    private final void A05(List<AbstractC06224s> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A06(List<AnonymousClass47> list, AbstractC06224s abstractC06224s) {
        for (int size = list.size() - 1; size >= 0; size--) {
            AnonymousClass47 changeInfo = list.get(size);
            if (A07(changeInfo, abstractC06224s) && changeInfo.A05 == null && changeInfo.A04 == null) {
                list.remove(changeInfo);
            }
        }
    }

    private boolean A07(AnonymousClass47 anonymousClass47, AbstractC06224s abstractC06224s) {
        boolean z10 = false;
        if (anonymousClass47.A04 == abstractC06224s) {
            anonymousClass47.A04 = null;
        } else if (anonymousClass47.A05 == abstractC06224s) {
            anonymousClass47.A05 = null;
            z10 = true;
        } else {
            return false;
        }
        abstractC06224s.A0H.setAlpha(1.0f);
        abstractC06224s.A0H.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        abstractC06224s.A0H.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        A0Q(abstractC06224s, z10);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4W
    public final void A0J() {
        boolean z10 = !this.A0A.isEmpty();
        boolean removalsPending = this.A09.isEmpty();
        boolean z11 = !removalsPending;
        boolean removalsPending2 = this.A08.isEmpty();
        boolean z12 = !removalsPending2;
        boolean removalsPending3 = this.A07.isEmpty();
        boolean z13 = !removalsPending3;
        if (!z10 && !z11 && !z13 && !z12) {
            return;
        }
        Iterator<AbstractC06224s> it = this.A0A.iterator();
        while (removalsPending) {
            A03(it.next());
        }
        this.A0A.clear();
        if (z11) {
            final ArrayList<AnonymousClass48> arrayList = new ArrayList<>();
            arrayList.addAll(this.A09);
            this.A05.add(arrayList);
            this.A09.clear();
            Runnable runnable = new Runnable() { // from class: com.facebook.ads.redexgen.X.3z
                @Override // java.lang.Runnable
                public final void run() {
                    for (AnonymousClass48 anonymousClass48 : arrayList) {
                        this.A00.A0Y(anonymousClass48.A04, anonymousClass48.A00, anonymousClass48.A01, anonymousClass48.A02, anonymousClass48.A03);
                    }
                    arrayList.clear();
                    this.A00.A05.remove(arrayList);
                }
            };
            if (z10) {
                C3F.A0E(arrayList.get(0).A04.A0H, runnable, A07());
            } else {
                runnable.run();
            }
        }
        if (z12) {
            final ArrayList<AnonymousClass47> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.A08);
            this.A03.add(arrayList2);
            this.A08.clear();
            Runnable runnable2 = new Runnable() { // from class: com.facebook.ads.redexgen.X.40
                @Override // java.lang.Runnable
                public final void run() {
                    for (AnonymousClass47 change : arrayList2) {
                        this.A00.A0W(change);
                    }
                    arrayList2.clear();
                    this.A00.A03.remove(arrayList2);
                }
            };
            if (z10) {
                C3F.A0E(arrayList2.get(0).A05.A0H, runnable2, A07());
            } else {
                runnable2.run();
            }
        }
        if (z13) {
            final ArrayList<AbstractC06224s> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.A07);
            this.A01.add(arrayList3);
            this.A07.clear();
            Runnable runnable3 = new Runnable() { // from class: com.facebook.ads.redexgen.X.41
                @Override // java.lang.Runnable
                public final void run() {
                    for (AbstractC06224s holder : arrayList3) {
                        this.A00.A0X(holder);
                    }
                    arrayList3.clear();
                    this.A00.A01.remove(arrayList3);
                }
            };
            if (!z10 && !z11 && !z12) {
                runnable3.run();
                return;
            }
            if (A0C[0].charAt(3) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[4] = "oGS3g0YSOogxL8fDiPQ9wWzcLRV8E0qu";
            strArr[3] = "UwBhVdK7HoWqzQqehBBKiWd5H5AJwN9O";
            C3F.A0E(arrayList3.get(0).A0H, runnable3, Math.max(z11 ? A06() : 0L, z12 ? A05() : 0L) + (z10 ? A07() : 0L));
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4W
    public final void A0K(AbstractC06224s abstractC06224s) {
        View view = abstractC06224s.A0H;
        view.animate().cancel();
        for (int i10 = this.A09.size() - 1; i10 >= 0; i10--) {
            if (this.A09.get(i10).A04 == abstractC06224s) {
                view.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                view.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                A0O(abstractC06224s);
                this.A09.remove(i10);
            }
        }
        A06(this.A08, abstractC06224s);
        if (this.A0A.remove(abstractC06224s)) {
            view.setAlpha(1.0f);
            A0P(abstractC06224s);
        }
        if (this.A07.remove(abstractC06224s)) {
            view.setAlpha(1.0f);
            A0N(abstractC06224s);
        }
        for (int i11 = this.A03.size() - 1; i11 >= 0; i11--) {
            ArrayList<AnonymousClass47> arrayList = this.A03.get(i11);
            A06(arrayList, abstractC06224s);
            if (arrayList.isEmpty()) {
                this.A03.remove(i11);
            }
        }
        for (int j10 = this.A05.size() - 1; j10 >= 0; j10--) {
            ArrayList<AnonymousClass48> arrayList2 = this.A05.get(j10);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                if (arrayList2.get(size).A04 == abstractC06224s) {
                    view.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    view.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    String[] strArr = A0C;
                    String str = strArr[4];
                    String str2 = strArr[3];
                    int i12 = str.charAt(9);
                    if (i12 == str2.charAt(9)) {
                        A0C[1] = "ZnQkkSK02m4qlFQsfXGc8k1uWyp7aRL1";
                        A0O(abstractC06224s);
                        arrayList2.remove(size);
                        if (!arrayList2.isEmpty()) {
                            break;
                        }
                        this.A05.remove(j10);
                        break;
                    }
                    throw new RuntimeException();
                }
            }
        }
        int size2 = this.A01.size();
        if (A0C[0].charAt(3) == 'S') {
            throw new RuntimeException();
        }
        A0C[7] = "NHib0yCpDtVNZGbvtAXjIsv6RzrfBwwf";
        for (int i13 = size2 - 1; i13 >= 0; i13--) {
            ArrayList<AbstractC06224s> arrayList3 = this.A01.get(i13);
            if (arrayList3.remove(abstractC06224s)) {
                view.setAlpha(1.0f);
                A0N(abstractC06224s);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(i13);
                }
            }
        }
        this.A06.remove(abstractC06224s);
        this.A00.remove(abstractC06224s);
        this.A02.remove(abstractC06224s);
        this.A04.remove(abstractC06224s);
        A0V();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[RETURN, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.C4W
    public final boolean A0L() {
        ArrayList<ArrayList<AnonymousClass47>> arrayList;
        if (this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A0A.isEmpty()) {
            boolean zIsEmpty = this.A04.isEmpty();
            String[] strArr = A0C;
            if (strArr[2].charAt(18) != strArr[5].charAt(18)) {
                String[] strArr2 = A0C;
                strArr2[4] = "HATKbuX1ioRbKjbJza4uRkbMkwnilInw";
                strArr2[3] = "55W5G9gSwoJRpeM2nuMk9rdzPBhIsXI5";
                if (zIsEmpty && this.A06.isEmpty()) {
                    boolean zIsEmpty2 = this.A00.isEmpty();
                    String[] strArr3 = A0C;
                    if (strArr3[2].charAt(18) != strArr3[5].charAt(18)) {
                        A0C[7] = "PBqWGImhwZdo7IXQpaNFK9QlBHxMp4wk";
                        if (zIsEmpty2) {
                            if (this.A02.isEmpty() && this.A05.isEmpty() && this.A01.isEmpty()) {
                                arrayList = this.A03;
                                if (A0C[7].charAt(30) != 'w') {
                                    throw new RuntimeException();
                                }
                                A0C[7] = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK";
                                if (!arrayList.isEmpty()) {
                                    return false;
                                }
                            }
                        }
                    } else if (zIsEmpty2) {
                        if (this.A02.isEmpty()) {
                            arrayList = this.A03;
                            if (A0C[7].charAt(30) != 'w') {
                                throw new RuntimeException();
                            }
                            A0C[7] = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK";
                            if (!arrayList.isEmpty()) {
                                return false;
                            }
                        }
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4W
    public final boolean A0M(AbstractC06224s abstractC06224s, List<Object> payloads) {
        return !payloads.isEmpty() || super.A0M(abstractC06224s, payloads);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1351Yk
    public final boolean A0R(AbstractC06224s abstractC06224s) {
        A04(abstractC06224s);
        abstractC06224s.A0H.setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.A07.add(abstractC06224s);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1351Yk
    public final boolean A0S(AbstractC06224s abstractC06224s) {
        A04(abstractC06224s);
        this.A0A.add(abstractC06224s);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1351Yk
    public final boolean A0U(AbstractC06224s abstractC06224s, AbstractC06224s abstractC06224s2, int i10, int i11, int i12, int i13) {
        if (abstractC06224s == abstractC06224s2) {
            return A0T(abstractC06224s, i10, i11, i12, i13);
        }
        float translationX = abstractC06224s.A0H.getTranslationX();
        float translationY = abstractC06224s.A0H.getTranslationY();
        float prevTranslationY = abstractC06224s.A0H.getAlpha();
        A04(abstractC06224s);
        float prevTranslationX = i12 - i10;
        int deltaY = (int) (prevTranslationX - translationX);
        float prevTranslationX2 = i13 - i11;
        int deltaX = (int) (prevTranslationX2 - translationY);
        abstractC06224s.A0H.setTranslationX(translationX);
        abstractC06224s.A0H.setTranslationY(translationY);
        abstractC06224s.A0H.setAlpha(prevTranslationY);
        if (abstractC06224s2 != null) {
            A04(abstractC06224s2);
            float prevTranslationX3 = -deltaY;
            abstractC06224s2.A0H.setTranslationX(prevTranslationX3);
            float prevTranslationX4 = -deltaX;
            abstractC06224s2.A0H.setTranslationY(prevTranslationX4);
            abstractC06224s2.A0H.setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        this.A08.add(new AnonymousClass47(abstractC06224s, abstractC06224s2, i10, i11, i12, i13));
        return true;
    }

    public final void A0V() {
        if (!A0L()) {
            A0A();
        }
    }

    public final void A0W(final AnonymousClass47 anonymousClass47) {
        final View view;
        AbstractC06224s holder = anonymousClass47.A05;
        if (holder == null) {
            view = null;
        } else {
            view = holder.A0H;
        }
        AbstractC06224s holder2 = anonymousClass47.A04;
        final View view2 = holder2 != null ? holder2.A0H : null;
        if (view != null) {
            final ViewPropertyAnimator oldViewAnim = view.animate().setDuration(A05());
            this.A02.add(anonymousClass47.A05);
            oldViewAnim.translationX(anonymousClass47.A02 - anonymousClass47.A00);
            oldViewAnim.translationY(anonymousClass47.A03 - anonymousClass47.A01);
            oldViewAnim.alpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.45
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    oldViewAnim.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    view.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    this.A03.A0Q(anonymousClass47.A05, true);
                    this.A03.A02.remove(anonymousClass47.A05);
                    this.A03.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.A02.add(anonymousClass47.A04);
            viewPropertyAnimatorAnimate.translationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD).translationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD).setDuration(A05()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.46
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorAnimate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    view2.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    this.A03.A0Q(anonymousClass47.A04, false);
                    this.A03.A02.remove(anonymousClass47.A04);
                    this.A03.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
    }

    public final void A0X(final AbstractC06224s abstractC06224s) {
        final View view = abstractC06224s.A0H;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A00.add(abstractC06224s);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(A04());
        animation.setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.43
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                this.A02.A0N(abstractC06224s);
                this.A02.A00.remove(abstractC06224s);
                this.A02.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    public final void A0Y(final AbstractC06224s abstractC06224s, int i10, int i11, int i12, int i13) {
        final View view = abstractC06224s.A0H;
        final int i14 = i12 - i10;
        final int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        if (i15 != 0) {
            view.animate().translationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A04.add(abstractC06224s);
        viewPropertyAnimatorAnimate.setDuration(A06()).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.44
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i14 != 0) {
                    view.setTranslationX(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                }
                if (i15 != 0) {
                    view.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                this.A04.A0O(abstractC06224s);
                this.A04.A04.remove(abstractC06224s);
                this.A04.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }
}
