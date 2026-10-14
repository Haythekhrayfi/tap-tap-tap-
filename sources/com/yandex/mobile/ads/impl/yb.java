package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f26753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f26754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f26755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ub f26756d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26758f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f26760h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f26759g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26757e = 0;

    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f26761a;

        public a(Handler handler) {
            this.f26761a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10) {
            yb.a(yb.this, i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i10) {
            this.f26761a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.iq1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21792c.a(i10);
                }
            });
        }
    }

    public interface b {
    }

    public yb(Context context, Handler handler, b bVar) {
        this.f26753a = (AudioManager) pa.a((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f26755c = bVar;
        this.f26754b = new a(handler);
    }

    private void a() {
        if (this.f26757e == 0) {
            return;
        }
        if (da1.f19803a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f26760h;
            if (audioFocusRequest != null) {
                this.f26753a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f26753a.abandonAudioFocus(this.f26754b);
        }
        a(0);
    }

    private void a(int i10) {
        if (this.f26757e == i10) {
            return;
        }
        this.f26757e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f26759g == f10) {
            return;
        }
        this.f26759g = f10;
        b bVar = this.f26755c;
        if (bVar != null) {
            rs.e(rs.this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    public static void a(yb ybVar, int i10) {
        b bVar;
        int i11;
        if (i10 == -3 || i10 == -2) {
            if (i10 == -2) {
                bVar = ybVar.f26755c;
                if (bVar != null) {
                    rs.b bVar2 = (rs.b) bVar;
                    boolean playWhenReady = rs.this.getPlayWhenReady();
                    rs.this.a(0, rs.a(playWhenReady, 0), playWhenReady);
                }
                i11 = 2;
            } else {
                ub ubVar = ybVar.f26756d;
                if (ubVar != null && ubVar.f25580a == 1) {
                    bVar = ybVar.f26755c;
                    if (bVar != null) {
                        rs.b bVar3 = (rs.b) bVar;
                        boolean playWhenReady2 = rs.this.getPlayWhenReady();
                        rs.this.a(0, rs.a(playWhenReady2, 0), playWhenReady2);
                    }
                    i11 = 2;
                } else {
                    i11 = 3;
                }
            }
            ybVar.a(i11);
            return;
        }
        if (i10 == -1) {
            b bVar4 = ybVar.f26755c;
            if (bVar4 != null) {
                rs.b bVar5 = (rs.b) bVar4;
                boolean playWhenReady3 = rs.this.getPlayWhenReady();
                rs.this.a(-1, rs.a(playWhenReady3, -1), playWhenReady3);
            }
            ybVar.a();
            return;
        }
        if (i10 != 1) {
            Objects.requireNonNull(ybVar);
            p90.d("AudioFocusManager", "Unknown focus change type: " + i10);
            return;
        }
        ybVar.a(1);
        b bVar6 = ybVar.f26755c;
        if (bVar6 != null) {
            rs.b bVar7 = (rs.b) bVar6;
            boolean playWhenReady4 = rs.this.getPlayWhenReady();
            rs.this.a(1, rs.a(playWhenReady4, 1), playWhenReady4);
        }
    }

    public final int a(boolean z10, int i10) {
        int iRequestAudioFocus;
        if (i10 == 1 || this.f26758f != 1) {
            a();
            return z10 ? 1 : -1;
        }
        if (z10) {
            if (this.f26757e == 1) {
                return 1;
            }
            if (da1.f19803a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f26760h;
                if (audioFocusRequest == null) {
                    AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f26758f) : new AudioFocusRequest.Builder(this.f26760h);
                    ub ubVar = this.f26756d;
                    boolean z11 = ubVar != null && ubVar.f25580a == 1;
                    Objects.requireNonNull(ubVar);
                    this.f26760h = builder.setAudioAttributes(ubVar.a().f25586a).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(this.f26754b).build();
                }
                iRequestAudioFocus = this.f26753a.requestAudioFocus(this.f26760h);
            } else {
                AudioManager audioManager = this.f26753a;
                a aVar = this.f26754b;
                ub ubVar2 = this.f26756d;
                Objects.requireNonNull(ubVar2);
                iRequestAudioFocus = audioManager.requestAudioFocus(aVar, da1.c(ubVar2.f25582c), this.f26758f);
            }
            if (iRequestAudioFocus == 1) {
                a(1);
                return 1;
            }
            a(0);
        }
        return -1;
    }

    public final float b() {
        return this.f26759g;
    }

    public final void c() {
        this.f26755c = null;
        a();
    }

    public final void d() {
        if (da1.a(this.f26756d, (Object) null)) {
            return;
        }
        this.f26756d = null;
        this.f26758f = 0;
    }
}
