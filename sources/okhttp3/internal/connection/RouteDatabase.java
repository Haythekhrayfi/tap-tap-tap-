package okhttp3.internal.connection;

import fd.j0;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Route;

/* JADX INFO: loaded from: classes3.dex */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        j0.i(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(Route route) {
        j0.i(route, "failedRoute");
        this.failedRoutes.add(route);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        j0.i(route, "route");
        return this.failedRoutes.contains(route);
    }
}
