package com.inscode.autoclicker.base;

import android.view.View;
import androidx.activity.i;
import com.inscode.autoclicker.ui.prepare.PrepareActivity;
import com.inscode.autoclicker.ui.prepare.PrepareScreen;
import com.zipoapps.premiumhelper.ui.startlikepro.StartLikeProActivity;
import fd.j0;
import ma.e;
import ma.h;
import y8.c0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13038c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13040e;

    public /* synthetic */ a(BaseAdapter baseAdapter, Object obj) {
        this.f13039d = baseAdapter;
        this.f13040e = obj;
    }

    public /* synthetic */ a(PrepareActivity prepareActivity, PrepareScreen prepareScreen) {
        this.f13039d = prepareActivity;
        this.f13040e = prepareScreen;
    }

    public /* synthetic */ a(StartLikeProActivity startLikeProActivity, h hVar) {
        this.f13039d = startLikeProActivity;
        this.f13040e = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13038c) {
            case 0:
                BaseAdapter.onBindViewHolder$lambda$0((BaseAdapter) this.f13039d, this.f13040e, view);
                break;
            case 1:
                PrepareActivity.bindScreen$lambda$0((PrepareActivity) this.f13039d, (PrepareScreen) this.f13040e, view);
                break;
            default:
                StartLikeProActivity startLikeProActivity = (StartLikeProActivity) this.f13039d;
                h hVar = (h) this.f13040e;
                int i10 = StartLikeProActivity.f28410d;
                j0.i(startLikeProActivity, "this$0");
                j0.i(hVar, "$premiumHelper");
                e eVar = startLikeProActivity.f28411c;
                if (eVar != null) {
                    if (hVar.f33418g.l()) {
                        if (eVar.f33402a.length() == 0) {
                            startLikeProActivity.g();
                        }
                    }
                    hVar.f33419h.o("onboarding", eVar.f33402a);
                    c0.z(i.l(startLikeProActivity), null, null, new StartLikeProActivity.a(hVar, startLikeProActivity, eVar, null), 3, null);
                }
                break;
        }
    }
}
