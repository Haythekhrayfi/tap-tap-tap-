package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f10715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f10716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f10717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f10718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f10719f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f10723j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f10726m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference<View> f10720g = new WeakReference<>(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10721h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f10722i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HandlerThread f10724k = new HandlerThread("BlackViewDetector");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f10725l = new Runnable() { // from class: com.applovin.impl.sdk.k.1
        @Override // java.lang.Runnable
        public void run() {
            k.this.b();
        }
    };

    public interface a {
        void a(View view);
    }

    public interface b {
        void a(Bitmap bitmap);

        void a(boolean z10);
    }

    public k(o oVar) {
        this.f10714a = oVar;
        this.f10715b = oVar.F();
        this.f10716c = ((Long) oVar.a(com.applovin.impl.sdk.c.b.gx)).longValue();
        this.f10717d = ((Long) oVar.a(com.applovin.impl.sdk.c.b.gw)).longValue();
        this.f10718e = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.gy)).intValue();
        this.f10719f = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.gz)).intValue();
    }

    private void a(View view, final b bVar) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        if (Build.VERSION.SDK_INT >= 26) {
            Activity activityB = this.f10714a.E().b();
            if (activityB == null) {
                if (y.a()) {
                    this.f10715b.e("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                bVar.a(false);
                return;
            }
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            try {
                PixelCopy.request(activityB.getWindow(), new Rect(iArr[0], iArr[1], iArr[0] + measuredWidth, iArr[1] + measuredHeight), bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.applovin.impl.sdk.k.4
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public void onPixelCopyFinished(int i10) {
                        if (i10 == 0) {
                            bVar.a(bitmapCreateBitmap);
                            return;
                        }
                        y unused = k.this.f10715b;
                        if (y.a()) {
                            k.this.f10715b.e("BlackViewDetector", "Failed to capture screenshot with error code: " + i10);
                        }
                        bVar.a(true);
                    }
                }, new Handler());
                return;
            } catch (Throwable th) {
                if (y.a()) {
                    this.f10715b.e("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
            }
        } else if (y.a()) {
            this.f10715b.d("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        bVar.a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i10) {
        boolean z10 = Color.red(i10) <= this.f10719f && Color.blue(i10) <= this.f10719f && Color.green(i10) <= this.f10719f;
        Integer num = this.f10722i;
        return !z10 || (num != null && i10 != num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        View view = this.f10720g.get();
        if (view == null) {
            if (y.a()) {
                this.f10715b.d("BlackViewDetector", "Monitored view no longer exists.");
            }
            a();
            return;
        }
        if (y.a()) {
            this.f10715b.b("BlackViewDetector", "Checking for black view: " + view);
        }
        final int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new b() { // from class: com.applovin.impl.sdk.k.2
                @Override // com.applovin.impl.sdk.k.b
                public void a(Bitmap bitmap) {
                    int i10 = measuredWidth / k.this.f10718e;
                    int i11 = measuredHeight / k.this.f10718e;
                    int i12 = i10 / 2;
                    for (int i13 = i11 / 2; i13 < measuredHeight; i13 += i11) {
                        for (int i14 = i12; i14 < measuredWidth; i14 += i10) {
                            int pixel = bitmap.getPixel(i14, i13);
                            if (k.this.a(pixel)) {
                                k.this.f10721h = 0;
                                bitmap.recycle();
                                k.this.c();
                            } else {
                                if (k.this.f10722i == null) {
                                    k.this.f10722i = Integer.valueOf(pixel);
                                }
                            }
                        }
                    }
                    k.e(k.this);
                    bitmap.recycle();
                    k.this.c();
                }

                @Override // com.applovin.impl.sdk.k.b
                public void a(boolean z10) {
                    if (z10) {
                        k.this.a();
                    }
                }
            });
            return;
        }
        if (y.a()) {
            this.f10715b.d("BlackViewDetector", j1.e.a("Monitored view is not visible due to dimensions (width = ", measuredWidth, ", height = ", measuredHeight, ")"));
        }
        this.f10721h = 0;
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    public void c() {
        long j10 = this.f10716c;
        if (j10 > 0) {
            if (this.f10721h > 1) {
                d();
            } else {
                Handler handler = this.f10723j;
                if (handler != null) {
                    handler.postDelayed(this.f10725l, j10);
                    return;
                } else if (y.a()) {
                    this.f10715b.d("BlackViewDetector", "Monitoring handler was unexpectedly null");
                }
            }
        } else if (this.f10721h == 1) {
            d();
        }
        a();
    }

    private void d() {
        final View view = this.f10720g.get();
        if (y.a()) {
            this.f10715b.d("BlackViewDetector", "Detected black view: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.k.3
            @Override // java.lang.Runnable
            public void run() {
                if (k.this.f10726m != null) {
                    k.this.f10726m.a(view);
                }
            }
        });
    }

    public static /* synthetic */ int e(k kVar) {
        int i10 = kVar.f10721h;
        kVar.f10721h = i10 + 1;
        return i10;
    }

    public void a() {
        if (this.f10720g.get() == null) {
            return;
        }
        if (y.a()) {
            y yVar = this.f10715b;
            StringBuilder sbA = defpackage.a.a("Stopped monitoring view: ");
            sbA.append(this.f10720g.get());
            yVar.b("BlackViewDetector", sbA.toString());
        }
        Handler handler = this.f10723j;
        if (handler != null) {
            handler.removeCallbacks(this.f10725l);
            this.f10723j = null;
            this.f10724k.quit();
        }
        this.f10720g.clear();
        this.f10726m = null;
    }

    public void a(View view, a aVar) {
        if (((Boolean) this.f10714a.a(com.applovin.impl.sdk.c.b.gv)).booleanValue()) {
            View view2 = this.f10720g.get();
            if (view2 != null) {
                if (y.a()) {
                    this.f10715b.d("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            this.f10726m = aVar;
            this.f10720g = new WeakReference<>(view);
            this.f10721h = 0;
            this.f10722i = null;
            if (y.a()) {
                this.f10715b.b("BlackViewDetector", "Started monitoring view: " + view);
            }
            this.f10724k.start();
            Handler handler = new Handler(this.f10724k.getLooper());
            this.f10723j = handler;
            handler.postDelayed(this.f10725l, this.f10717d);
        }
    }
}
