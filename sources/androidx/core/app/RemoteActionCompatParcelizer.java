package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        t1.b bVarO = remoteActionCompat.f1639a;
        if (aVar.i(1)) {
            bVarO = aVar.o();
        }
        remoteActionCompat.f1639a = (IconCompat) bVarO;
        CharSequence charSequenceH = remoteActionCompat.f1640b;
        if (aVar.i(2)) {
            charSequenceH = aVar.h();
        }
        remoteActionCompat.f1640b = charSequenceH;
        CharSequence charSequenceH2 = remoteActionCompat.f1641c;
        if (aVar.i(3)) {
            charSequenceH2 = aVar.h();
        }
        remoteActionCompat.f1641c = charSequenceH2;
        remoteActionCompat.f1642d = (PendingIntent) aVar.m(remoteActionCompat.f1642d, 4);
        boolean zF = remoteActionCompat.f1643e;
        if (aVar.i(5)) {
            zF = aVar.f();
        }
        remoteActionCompat.f1643e = zF;
        boolean zF2 = remoteActionCompat.f1644f;
        if (aVar.i(6)) {
            zF2 = aVar.f();
        }
        remoteActionCompat.f1644f = zF2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        Objects.requireNonNull(aVar);
        IconCompat iconCompat = remoteActionCompat.f1639a;
        aVar.p(1);
        aVar.w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1640b;
        aVar.p(2);
        aVar.s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f1641c;
        aVar.p(3);
        aVar.s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f1642d;
        aVar.p(4);
        aVar.u(pendingIntent);
        boolean z10 = remoteActionCompat.f1643e;
        aVar.p(5);
        aVar.q(z10);
        boolean z11 = remoteActionCompat.f1644f;
        aVar.p(6);
        aVar.q(z11);
    }
}
