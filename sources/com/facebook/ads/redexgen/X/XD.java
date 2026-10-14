package com.facebook.ads.redexgen.X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XD implements IJ, AP, FX, DF, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"nMHZhEZSp5EcTMzj890UQSIKsf7nOssk", "WLzxKTE2vNTMCpqDs", "SfczCGFglH", "X5aT15p3N3rGxVL5g", "GbnJfxrb9aQYK7s9S1Y8QTSWgx7P8ZxV", "tLWa3XxeFvyx8wOT4", "wILb6N7ReXeeP8cmU", "dyBLf42uqj"};
    public final /* synthetic */ C0813Dg A00;

    public XD(C0813Dg c0813Dg) {
        this.A00 = c0813Dg;
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void AAO(String str, long j10, long j11) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((AP) it.next()).AAO(str, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void AAP(C0766As c0766As) {
        for (AP ap : this.A00.A0I) {
            String[] strArr = A01;
            if (strArr[1].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A01[4] = "5uZ3F86UAJ67QZD2oUJwcWpEFJTFqeup";
            ap.AAP(c0766As);
        }
        this.A00.A06 = null;
        this.A00.A09 = null;
        this.A00.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void AAQ(C0766As c0766As) {
        this.A00.A09 = c0766As;
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((AP) it.next()).AAQ(c0766As);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void AAR(Format format) {
        this.A00.A06 = format;
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((AP) it.next()).AAR(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void AAS(int i10) {
        this.A00.A01 = i10;
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((AP) it.next()).AAS(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void AAT(int i10, long j10, long j11) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((AP) it.next()).AAT(i10, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FX
    public final void AAp(List<FT> list) {
        this.A00.A0C = list;
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((FX) it.next()).AAp(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IJ
    public final void AB2(int i10, long j10) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((IJ) it.next()).AB2(i10, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DF
    public final void ABx(Metadata metadata) {
        Iterator it = this.A00.A0J.iterator();
        while (it.hasNext()) {
            ((DF) it.next()).ABx(metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IJ
    public final void ACX(Surface surface) {
        if (this.A00.A03 == surface) {
            Iterator it = this.A00.A0M.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = this.A00.A0L.iterator();
        while (it2.hasNext()) {
            ((IJ) it2.next()).ACX(surface);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IJ
    public final void AD9(String str, long j10, long j11) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((IJ) it.next()).AD9(str, j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IJ
    public final void ADA(C0766As c0766As) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((IJ) it.next()).ADA(c0766As);
        }
        this.A00.A07 = null;
        String[] strArr = A01;
        if (strArr[1].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A01[0] = "zG8NefRqMKYqbgzRufdCrC4W5rqrDhRZ";
        this.A00.A0A = null;
    }

    @Override // com.facebook.ads.redexgen.X.IJ
    public final void ADB(C0766As c0766As) {
        this.A00.A0A = c0766As;
        Iterator it = this.A00.A0L.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A01[0].charAt(5) == '7') {
                throw new RuntimeException();
            }
            A01[4] = "B3QwduSxUwudXX0SLqqw26pCzLpqq2sU";
            if (zHasNext) {
                ((IJ) it.next()).ADB(c0766As);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.IJ
    public final void ADF(Format format) {
        this.A00.A07 = format;
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((IJ) it.next()).ADF(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IJ
    public final void ADK(int i10, int i11, int i12, float f10) {
        Iterator it = this.A00.A0M.iterator();
        while (it.hasNext()) {
            ((IA) it.next()).ADK(i10, i11, i12, f10);
        }
        Iterator it2 = this.A00.A0L.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            String[] strArr = A01;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[4] = "2vUTxC8fdDWhhRkArIujhTo4qLvFXYNt";
            if (zHasNext) {
                ((IJ) it2.next()).ADK(i10, i11, i12, f10);
            } else {
                return;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.A00.A0G(new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A0G(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A0G(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A0G(null, false);
    }
}
