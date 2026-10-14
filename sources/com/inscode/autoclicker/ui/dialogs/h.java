package com.inscode.autoclicker.ui.dialogs;

import android.content.Context;
import android.view.MenuItem;
import android.widget.PopupMenu;
import com.inscode.autoclicker.base.BaseAdapter;
import java.util.List;
import vc.a0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements PopupMenu.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r6.e f13361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f13362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f13363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f13364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ BaseAdapter f13365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0 f13366h;

    public /* synthetic */ h(Context context, r6.e eVar, a0 a0Var, List list, List list2, BaseAdapter baseAdapter, a0 a0Var2, int i10) {
        this.f13359a = i10;
        this.f13360b = context;
        this.f13361c = eVar;
        this.f13362d = a0Var;
        this.f13363e = list;
        this.f13364f = list2;
        this.f13365g = baseAdapter;
        this.f13366h = a0Var2;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f13359a) {
            case 0:
                return ModeSettingsDialogs.Companion.showLoadRecordingsDialog$lambda$57$lambda$53$lambda$52(this.f13360b, this.f13361c, this.f13362d, this.f13363e, this.f13364f, this.f13365g, this.f13366h, menuItem);
            default:
                return ModeSettingsDialogs.Companion.showLoadRecordingsDialog$lambda$57$lambda$55$lambda$54(this.f13360b, this.f13361c, this.f13362d, this.f13363e, this.f13364f, this.f13365g, this.f13366h, menuItem);
        }
    }
}
