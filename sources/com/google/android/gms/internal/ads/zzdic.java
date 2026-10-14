package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdic implements GestureDetector.OnGestureListener {
    private final zzdgv zza;
    private final zzdhw zzb;

    public zzdic(zzdgv zzdgvVar, zzdhw zzdhwVar) {
        this.zza = zzdgvVar;
        this.zzb = zzdhwVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int y10;
        if (this.zza == null) {
            return false;
        }
        int i10 = -1;
        if (Math.abs(f10) > Math.abs(f11)) {
            if (f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                y10 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f10) * 1000.0f);
                i10 = 1;
            } else if (f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                y10 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f10) * 1000.0f);
                i10 = 2;
            } else {
                y10 = 0;
            }
        } else if (f11 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            y10 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f11) * 1000.0f);
            i10 = 8;
        } else if (f11 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            y10 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f11) * 1000.0f);
            i10 = 4;
        } else {
            y10 = 0;
        }
        if (i10 != this.zza.zza()) {
            return false;
        }
        this.zza.zzD(this.zzb.zzr(), y10);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
