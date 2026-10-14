package com.applovin.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f4716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f4717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f4718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.exoplayer2.b.d f4719d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4721f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f4723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4724i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f4722g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4720e = 0;

    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f4726b;

        public a(Handler handler) {
            this.f4726b = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10) {
            c.this.c(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f4726b.post(new Runnable() { // from class: com.applovin.exoplayer2.d0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5183c.a(i10);
                }
            });
        }
    }

    public interface b {
        void a(float f10);

        void a(int i10);
    }

    public c(Context context, Handler handler, b bVar) {
        this.f4716a = (AudioManager) com.applovin.exoplayer2.l.a.b((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f4718c = bVar;
        this.f4717b = new a(handler);
    }

    private boolean a(int i10) {
        return i10 == 1 || this.f4721f != 1;
    }

    private static int b(com.applovin.exoplayer2.b.d dVar) {
        if (dVar == null) {
            return 0;
        }
        switch (dVar.f4416d) {
            case 0:
                com.applovin.exoplayer2.l.q.c("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (dVar.f4414b == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                StringBuilder sbA = defpackage.a.a("Unidentified audio usage: ");
                sbA.append(dVar.f4416d);
                com.applovin.exoplayer2.l.q.c("AudioFocusManager", sbA.toString());
                return 0;
            case 16:
                return com.applovin.exoplayer2.l.ai.f7595a >= 19 ? 4 : 2;
        }
    }

    private void b(int i10) {
        if (this.f4720e == i10) {
            return;
        }
        this.f4720e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f4722g == f10) {
            return;
        }
        this.f4722g = f10;
        b bVar = this.f4718c;
        if (bVar != null) {
            bVar.a(f10);
        }
    }

    private int c() {
        if (this.f4720e == 1) {
            return 1;
        }
        if ((com.applovin.exoplayer2.l.ai.f7595a >= 26 ? f() : e()) == 1) {
            b(1);
            return 1;
        }
        b(0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i10) {
        int i11;
        if (i10 == -3 || i10 == -2) {
            if (i10 == -2 || i()) {
                d(0);
                i11 = 2;
            } else {
                i11 = 3;
            }
            b(i11);
            return;
        }
        if (i10 == -1) {
            d(-1);
            d();
        } else if (i10 == 1) {
            b(1);
            d(1);
        } else {
            com.applovin.exoplayer2.l.q.c("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    private void d() {
        if (this.f4720e == 0) {
            return;
        }
        if (com.applovin.exoplayer2.l.ai.f7595a >= 26) {
            h();
        } else {
            g();
        }
        b(0);
    }

    private void d(int i10) {
        b bVar = this.f4718c;
        if (bVar != null) {
            bVar.a(i10);
        }
    }

    private int e() {
        return this.f4716a.requestAudioFocus(this.f4717b, com.applovin.exoplayer2.l.ai.g(((com.applovin.exoplayer2.b.d) com.applovin.exoplayer2.l.a.b(this.f4719d)).f4416d), this.f4721f);
    }

    private int f() {
        AudioFocusRequest audioFocusRequest = this.f4723h;
        if (audioFocusRequest == null || this.f4724i) {
            this.f4723h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f4721f) : new AudioFocusRequest.Builder(this.f4723h)).setAudioAttributes(((com.applovin.exoplayer2.b.d) com.applovin.exoplayer2.l.a.b(this.f4719d)).a()).setWillPauseWhenDucked(i()).setOnAudioFocusChangeListener(this.f4717b).build();
            this.f4724i = false;
        }
        return this.f4716a.requestAudioFocus(this.f4723h);
    }

    private void g() {
        this.f4716a.abandonAudioFocus(this.f4717b);
    }

    private void h() {
        AudioFocusRequest audioFocusRequest = this.f4723h;
        if (audioFocusRequest != null) {
            this.f4716a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private boolean i() {
        com.applovin.exoplayer2.b.d dVar = this.f4719d;
        return dVar != null && dVar.f4414b == 1;
    }

    public float a() {
        return this.f4722g;
    }

    public int a(boolean z10, int i10) {
        if (a(i10)) {
            d();
            return z10 ? 1 : -1;
        }
        if (z10) {
            return c();
        }
        return -1;
    }

    public void a(com.applovin.exoplayer2.b.d dVar) {
        if (com.applovin.exoplayer2.l.ai.a(this.f4719d, dVar)) {
            return;
        }
        this.f4719d = dVar;
        int iB = b(dVar);
        this.f4721f = iB;
        boolean z10 = true;
        if (iB != 1 && iB != 0) {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public void b() {
        this.f4718c = null;
        d();
    }
}
