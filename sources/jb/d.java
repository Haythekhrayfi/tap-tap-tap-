package jb;

import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes3.dex */
public class d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f31802c;

    public d(Context context, f fVar) {
        this.f31802c = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        g.a(this.f31802c, false);
    }
}
