package com.facebook.ads.redexgen.X;

import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.analytics.AnalyticsCollector;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XB implements InterfaceC07299g, DF, AP, IJ, InterfaceC0843Ek, GU, B6 {
    public static String[] A05 = {"3ui7943oJKQ0earBMheCpqpPzXrDt0u1", "Y87VavrouiKi9z", "P6cMiRGLac5hfjC0tRGIGRLUUUjxE7XX", "Gp12Iojej9PCs1Iei8EmhswJ2d7MPPra", "iPLJe15l61uvnh9YTjVALhylcUuC36cq", "JkCpp1uc3ZLfv8H0X3nexU5u26UQU15j", "bG94g9DZx4SnKjROolD8g6Osz0P9GRGH", "l5hRkIxgm3MuCDpPoC4K2VrrhVSesDup"};
    public InterfaceC07349l A00;
    public final HJ A03;
    public final CopyOnWriteArraySet<A2> A04 = new CopyOnWriteArraySet<>();
    public final C07479z A02 = new C07479z();
    public final C07449w A01 = new C07449w();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final A1 A04(int i10, EU eu) {
        long jA00;
        HG.A01(this.A00);
        long jA5N = this.A03.A5N();
        AbstractC07459x abstractC07459xA6Y = this.A00.A6Y();
        if (i10 != this.A00.A6Z()) {
            jA00 = (i10 >= abstractC07459xA6Y.A01() || (eu != null && eu.A01())) ? 0L : abstractC07459xA6Y.A0B(i10, this.A01).A00();
        } else if (eu == null || !eu.A01()) {
            jA00 = this.A00.A6R();
        } else {
            jA00 = (this.A00.A6T() == eu.A00 && this.A00.A6U() == eu.A01) ? this.A00.A6W() : 0L;
        }
        return new A1(jA5N, abstractC07459xA6Y, i10, eu, jA00, this.A00.A6W(), this.A00.A66() - this.A00.A6R());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.GU
    public final void AAW(int i10, long j10, long j11) {
        A01();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public XB(InterfaceC07349l interfaceC07349l, HJ hj) {
        this.A00 = interfaceC07349l;
        this.A03 = (HJ) HG.A01(hj);
    }

    private A1 A00() {
        return A05(this.A02.A03());
    }

    private A1 A01() {
        return A05(this.A02.A04());
    }

    private A1 A02() {
        return A05(this.A02.A05());
    }

    private A1 A03() {
        return A05(this.A02.A06());
    }

    private A1 A05(A0 a10) {
        if (a10 == null) {
            Object objA01 = HG.A01(this.A00);
            String[] strArr = A05;
            if (strArr[5].charAt(24) != strArr[3].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[4] = "It2FvVQ6GuD0QkNXfVFrE8OCooaDSMpJ";
            strArr2[2] = "a2HOGJm5UwCLA4g7R7QNf278R1ClTDAB";
            int iA6Z = ((InterfaceC07349l) objA01).A6Z();
            return A04(iA6Z, this.A02.A07(iA6Z));
        }
        return A04(a10.A00, a10.A01);
    }

    public final void A06() {
        if (!this.A02.A0F()) {
            A1 a1A02 = A02();
            C07479z c07479z = this.A02;
            if (A05[7].charAt(15) == 'w') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[4] = "qsPEDs7YPcMFbl4XVvGjNAFSUVJ30e5d";
            strArr[2] = "wNEtz3pAWSMGqURdz3XYnwNQJEjBbTAW";
            c07479z.A09();
            Iterator<A2> it = this.A04.iterator();
            while (it.hasNext()) {
                it.next().onSeekStarted(a1A02);
            }
        }
    }

    public final void A07() {
        List<AnalyticsCollector.WindowAndMediaPeriodId> activeMediaPeriods = new ArrayList<>(this.A02.A05);
        Iterator<AnalyticsCollector.WindowAndMediaPeriodId> it = activeMediaPeriods.iterator();
        while (it.hasNext()) {
            A0 a10 = (A0) it.next();
            ABu(a10.A00, a10.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void AAO(String str, long j10, long j11) {
        A1 a1A03 = A03();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(a1A03, 1, str, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void AAP(C0766As c0766As) {
        A1 a1A00 = A00();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(a1A00, 1, c0766As);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void AAQ(C0766As c0766As) {
        A1 a1A02 = A02();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(a1A02, 1, c0766As);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void AAR(Format format) {
        A1 a1A03 = A03();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(a1A03, 1, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void AAS(int i10) {
        A1 a1A03 = A03();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onAudioSessionId(a1A03, i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void AAT(int i10, long j10, long j11) {
        A1 a1A03 = A03();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onAudioUnderrun(a1A03, i10, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0843Ek
    public final void AAx(int i10, EU eu, C0842Ej c0842Ej) {
        A1 a1A04 = A04(i10, eu);
        Iterator<A2> it = this.A04.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A05[7].charAt(15) == 'w') {
                throw new RuntimeException();
            }
            A05[7] = "A4QXCUmAUOBVX64TvaZ46B5z8oAUnNZh";
            if (zHasNext) {
                it.next().onDownstreamFormatChanged(a1A04, c0842Ej);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void AAy() {
        A1 a1A03 = A03();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysLoaded(a1A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void AAz() {
        A1 a1A03 = A03();
        Iterator<A2> it = this.A04.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A05[7].charAt(15) == 'w') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[4] = "H8nHlV26gM4XBGJAm7WOVvtwu96ZUK2X";
            strArr[2] = "PAYN32B5Yp2dRtm6BiBsWpdjvopWw5ut";
            if (zHasNext) {
                it.next().onDrmKeysRemoved(a1A03);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void AB0() {
        A1 a1A03 = A03();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysRestored(a1A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void AB1(Exception exc) {
        A1 a1A03 = A03();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmSessionManagerError(a1A03, exc);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IJ
    public final void AB2(int i10, long j10) {
        A1 a1A00 = A00();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDroppedVideoFrames(a1A00, i10, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0843Ek
    public final void ABd(int i10, EU eu, C0841Ei c0841Ei, C0842Ej c0842Ej) {
        A04(i10, eu);
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0843Ek
    public final void ABf(int i10, EU eu, C0841Ei c0841Ei, C0842Ej c0842Ej) {
        A04(i10, eu);
        Iterator<A2> it = this.A04.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A05[7].charAt(15) == 'w') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "U0y5Da5mII5YR5LLA1Yw3vUoz2XQzjRa";
            strArr[6] = "AsACfu1w80VTJMOzwO3g8Y2nz7gc0iIE";
            if (!zHasNext) {
                return;
            } else {
                it.next();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0843Ek
    public final void ABi(int i10, EU eu, C0841Ei c0841Ei, C0842Ej c0842Ej, IOException iOException, boolean z10) {
        A1 a1A04 = A04(i10, eu);
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onLoadError(a1A04, c0841Ei, c0842Ej, iOException, z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0843Ek
    public final void ABk(int i10, EU eu, C0841Ei c0841Ei, C0842Ej c0842Ej) {
        A04(i10, eu);
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07299g
    public final void ABm(boolean z10) {
        A1 a1A02 = A02();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onLoadingChanged(a1A02, z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0843Ek
    public final void ABt(int i10, EU eu) {
        this.A02.A0B(i10, eu);
        A1 a1A04 = A04(i10, eu);
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodCreated(a1A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0843Ek
    public final void ABu(int i10, EU eu) {
        this.A02.A0C(i10, eu);
        A1 a1A04 = A04(i10, eu);
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodReleased(a1A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DF
    public final void ABx(Metadata metadata) {
        A1 a1A02 = A02();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMetadata(a1A02, metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07299g
    public final void ACD(C07269d c07269d) {
        A1 a1A02 = A02();
        for (A2 a10 : this.A04) {
            if (A05[7].charAt(15) == 'w') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "tyr0dpEvlbVKV2bQNXg9NMaK2xy6BoSW";
            strArr[3] = "0QT1knH3BDrt7WSXrhNoOdrd2qYVbD8e";
            a10.onPlaybackParametersChanged(a1A02, c07269d);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07299g
    public final void ACF(C9I c9i) {
        A1 a1A02 = A02();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onPlayerError(a1A02, c9i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07299g
    public final void ACH(boolean z10, int i10) {
        A1 a1A02 = A02();
        Iterator<A2> it = this.A04.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[0].charAt(24) != strArr[6].charAt(24)) {
                throw new RuntimeException();
            }
            A05[1] = "LXJ0q";
            if (!zHasNext) {
                return;
            }
            A2 next = it.next();
            String[] strArr2 = A05;
            if (strArr2[4].charAt(29) != strArr2[2].charAt(29)) {
                String[] strArr3 = A05;
                strArr3[5] = "X7wD26nry5cKRUDoaHEW6GIg2BkBQsxF";
                strArr3[3] = "mBKm4QAdZAalWFRu5fZgU4pH2nbenvRU";
                next.onPlayerStateChanged(a1A02, z10, i10);
            } else {
                String[] strArr4 = A05;
                strArr4[5] = "Z6EwV7KsnuzYN7ajnraaFM2k28xO4kcl";
                strArr4[3] = "L2gfOX15V0Xhx6fkmzEhPGDX2RpQhPed";
                next.onPlayerStateChanged(a1A02, z10, i10);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07299g
    public final void ACJ(int i10) {
        this.A02.A0A(i10);
        A1 a1A02 = A02();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onPositionDiscontinuity(a1A02, i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0843Ek
    public final void ACT(int i10, EU eu) {
        this.A02.A0D(i10, eu);
        A1 a1A04 = A04(i10, eu);
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onReadingStarted(a1A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IJ
    public final void ACX(Surface surface) {
        A1 a1A03 = A03();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onRenderedFirstFrame(a1A03, surface);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07299g
    public final void ACi() {
        if (this.A02.A0F()) {
            this.A02.A08();
            A1 a1A02 = A02();
            Iterator<A2> it = this.A04.iterator();
            while (it.hasNext()) {
                it.next().onSeekProcessed(a1A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07299g
    public final void ACy(AbstractC07459x abstractC07459x, Object obj, int i10) {
        this.A02.A0E(abstractC07459x);
        A1 a1A02 = A02();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTimelineChanged(a1A02, i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07299g
    public final void AD1(TrackGroupArray trackGroupArray, GN gn) {
        A1 a1A02 = A02();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTracksChanged(a1A02, trackGroupArray, gn);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IJ
    public final void AD9(String str, long j10, long j11) {
        A1 a1A03 = A03();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(a1A03, 2, str, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IJ
    public final void ADA(C0766As c0766As) {
        A1 a1A00 = A00();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(a1A00, 2, c0766As);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IJ
    public final void ADB(C0766As c0766As) {
        A1 a1A02 = A02();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(a1A02, 2, c0766As);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IJ
    public final void ADF(Format format) {
        A1 a1A03 = A03();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(a1A03, 2, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IJ
    public final void ADK(int i10, int i11, int i12, float f10) {
        A1 a1A03 = A03();
        Iterator<A2> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(a1A03, i10, i11, i12, f10);
        }
    }
}
