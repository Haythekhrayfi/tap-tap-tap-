package com.inscode.autoclicker.utils;

import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DuoDrawerLayout2 f13418e;

    public a(DuoDrawerLayout2 duoDrawerLayout2) {
        this.f13418e = duoDrawerLayout2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f13418e.f13403n != 2) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f13416c = motionEvent.getX();
                this.f13417d = motionEvent.getY();
            } else if (action == 1) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                DuoDrawerLayout2 duoDrawerLayout2 = this.f13418e;
                float f10 = this.f13416c;
                float f11 = this.f13417d;
                Objects.requireNonNull(duoDrawerLayout2);
                if (Math.abs(f10 - x10) <= 300.0f && Math.abs(f11 - y10) <= 300.0f) {
                    this.f13418e.a();
                }
            } else if (action == 2) {
                this.f13418e.f13410u.f13414a = true;
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                DuoDrawerLayout2 duoDrawerLayout3 = this.f13418e;
                duoDrawerLayout3.f13407r.b(duoDrawerLayout3.f13411v, action2);
            }
        }
        return true;
    }
}
