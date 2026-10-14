package gb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f30411a = new w();

    static {
        new ed.f("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
    }

    public static boolean b(w wVar, String str, int i10, int i11, int i12) throws IOException {
        boolean z10;
        if ((i12 & 2) != 0) {
            i10 = 443;
        }
        if ((i12 & 4) != 0) {
            i11 = 1000;
        }
        j0.i(str, "host");
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(str, i10), i11);
            z10 = true;
        } catch (Exception unused) {
            z10 = false;
        } finally {
            socket.close();
        }
        return z10;
    }

    public final String a(Context context) {
        LinkProperties linkProperties;
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (Build.VERSION.SDK_INT < 28) {
            return "not supported";
        }
        Object systemService = context.getSystemService("connectivity");
        j0.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        String privateDnsServerName = null;
        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
            privateDnsServerName = linkProperties.getPrivateDnsServerName();
        }
        return privateDnsServerName == null ? "" : privateDnsServerName;
    }

    public final boolean c(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Object systemService = context.getSystemService("connectivity");
        j0.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(4);
        }
        return false;
    }
}
