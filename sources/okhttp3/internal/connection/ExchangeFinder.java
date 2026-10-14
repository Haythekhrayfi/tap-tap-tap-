package okhttp3.internal.connection;

import com.google.android.gms.common.internal.ImagesContract;
import fd.j0;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes3.dex */
public final class ExchangeFinder {
    private final Address address;
    private final RealCall call;
    private final RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final EventListener eventListener;
    private Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;

    public ExchangeFinder(RealConnectionPool realConnectionPool, Address address, RealCall realCall, EventListener eventListener) {
        j0.i(realConnectionPool, "connectionPool");
        j0.i(address, "address");
        j0.i(realCall, "call");
        j0.i(eventListener, "eventListener");
        this.connectionPool = realConnectionPool;
        this.address = address;
        this.call = realCall;
        this.eventListener = eventListener;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:78:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final RealConnection findConnection(int i10, int i11, int i12, int i13, boolean z10) throws IOException {
        List<Route> routes;
        RealConnection realConnection;
        RealConnection connection;
        Socket socketReleaseConnectionNoEvents$okhttp;
        if (this.call.isCanceled()) {
            throw new IOException("Canceled");
        }
        RealConnection connection2 = this.call.getConnection();
        if (connection2 != null) {
            synchronized (connection2) {
                socketReleaseConnectionNoEvents$okhttp = (connection2.getNoNewExchanges() || !sameHostAndPort(connection2.route().address().url())) ? this.call.releaseConnectionNoEvents$okhttp() : null;
            }
            if (this.call.getConnection() != null) {
                if (socketReleaseConnectionNoEvents$okhttp == null) {
                    return connection2;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            if (socketReleaseConnectionNoEvents$okhttp != null) {
                Util.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
            }
            this.eventListener.connectionReleased(this.call, connection2);
        }
        this.refusedStreamCount = 0;
        this.connectionShutdownCount = 0;
        this.otherFailureCount = 0;
        if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, null, false)) {
            connection = this.call.getConnection();
            j0.f(connection);
        } else {
            Route next = this.nextRouteToTry;
            try {
                if (next != null) {
                    j0.f(next);
                    this.nextRouteToTry = null;
                } else {
                    RouteSelector.Selection selection = this.routeSelection;
                    if (selection != null) {
                        j0.f(selection);
                        if (selection.hasNext()) {
                            RouteSelector.Selection selection2 = this.routeSelection;
                            j0.f(selection2);
                            next = selection2.next();
                        }
                        realConnection = new RealConnection(this.connectionPool, next);
                        this.call.setConnectionToCancel(realConnection);
                        realConnection.connect(i10, i11, i12, i13, z10, this.call, this.eventListener);
                        this.call.setConnectionToCancel(null);
                        this.call.getClient().getRouteDatabase().connected(realConnection.route());
                        if (!this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                            synchronized (realConnection) {
                                this.connectionPool.put(realConnection);
                                this.call.acquireConnectionNoEvents(realConnection);
                            }
                            this.eventListener.connectionAcquired(this.call, realConnection);
                            return realConnection;
                        }
                        connection = this.call.getConnection();
                        j0.f(connection);
                        this.nextRouteToTry = next;
                        Util.closeQuietly(realConnection.socket());
                    }
                    RouteSelector routeSelector = this.routeSelector;
                    if (routeSelector == null) {
                        routeSelector = new RouteSelector(this.address, this.call.getClient().getRouteDatabase(), this.call, this.eventListener);
                        this.routeSelector = routeSelector;
                    }
                    RouteSelector.Selection next2 = routeSelector.next();
                    this.routeSelection = next2;
                    routes = next2.getRoutes();
                    if (this.call.isCanceled()) {
                        throw new IOException("Canceled");
                    }
                    if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, false)) {
                        connection = this.call.getConnection();
                        j0.f(connection);
                    } else {
                        next = next2.next();
                        realConnection = new RealConnection(this.connectionPool, next);
                        this.call.setConnectionToCancel(realConnection);
                        realConnection.connect(i10, i11, i12, i13, z10, this.call, this.eventListener);
                        this.call.setConnectionToCancel(null);
                        this.call.getClient().getRouteDatabase().connected(realConnection.route());
                        if (!this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                            synchronized (realConnection) {
                                this.connectionPool.put(realConnection);
                                this.call.acquireConnectionNoEvents(realConnection);
                                this.eventListener.connectionAcquired(this.call, realConnection);
                                return realConnection;
                            }
                        }
                        connection = this.call.getConnection();
                        j0.f(connection);
                        this.nextRouteToTry = next;
                        Util.closeQuietly(realConnection.socket());
                    }
                }
                realConnection.connect(i10, i11, i12, i13, z10, this.call, this.eventListener);
                this.call.setConnectionToCancel(null);
                this.call.getClient().getRouteDatabase().connected(realConnection.route());
                if (!this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                    synchronized (realConnection) {
                        this.connectionPool.put(realConnection);
                        this.call.acquireConnectionNoEvents(realConnection);
                        this.eventListener.connectionAcquired(this.call, realConnection);
                        return realConnection;
                    }
                }
                connection = this.call.getConnection();
                j0.f(connection);
                this.nextRouteToTry = next;
                Util.closeQuietly(realConnection.socket());
            } catch (Throwable th) {
                this.call.setConnectionToCancel(null);
                throw th;
            }
            routes = null;
            realConnection = new RealConnection(this.connectionPool, next);
            this.call.setConnectionToCancel(realConnection);
        }
        this.eventListener.connectionAcquired(this.call, connection);
        return connection;
    }

    private final RealConnection findHealthyConnection(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        while (true) {
            RealConnection realConnectionFindConnection = findConnection(i10, i11, i12, i13, z10);
            if (realConnectionFindConnection.isHealthy(z11)) {
                return realConnectionFindConnection;
            }
            realConnectionFindConnection.noNewExchanges$okhttp();
            if (this.nextRouteToTry == null) {
                RouteSelector.Selection selection = this.routeSelection;
                if (selection == null ? true : selection.hasNext()) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.routeSelector;
                    if (!(routeSelector != null ? routeSelector.hasNext() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final Route retryRoute() {
        RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount$okhttp() != 0) {
                return null;
            }
            if (Util.canReuseConnectionFor(connection.route().address().url(), getAddress$okhttp().url())) {
                return connection.route();
            }
            return null;
        }
    }

    public final ExchangeCodec find(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) {
        j0.i(okHttpClient, "client");
        j0.i(realInterceptorChain, "chain");
        try {
            return findHealthyConnection(realInterceptorChain.getConnectTimeoutMillis$okhttp(), realInterceptorChain.getReadTimeoutMillis$okhttp(), realInterceptorChain.getWriteTimeoutMillis$okhttp(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), !j0.d(realInterceptorChain.getRequest$okhttp().method(), "GET")).newCodec$okhttp(okHttpClient, realInterceptorChain);
        } catch (IOException e10) {
            trackFailure(e10);
            throw new RouteException(e10);
        } catch (RouteException e11) {
            trackFailure(e11.getLastConnectException());
            throw e11;
        }
    }

    public final Address getAddress$okhttp() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        RouteSelector routeSelector;
        boolean z10 = false;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        Route routeRetryRoute = retryRoute();
        if (routeRetryRoute != null) {
            this.nextRouteToTry = routeRetryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if (selection != null && selection.hasNext()) {
            z10 = true;
        }
        if (z10 || (routeSelector = this.routeSelector) == null) {
            return true;
        }
        return routeSelector.hasNext();
    }

    public final boolean sameHostAndPort(HttpUrl httpUrl) {
        j0.i(httpUrl, ImagesContract.URL);
        HttpUrl httpUrlUrl = this.address.url();
        return httpUrl.port() == httpUrlUrl.port() && j0.d(httpUrl.host(), httpUrlUrl.host());
    }

    public final void trackFailure(IOException iOException) {
        j0.i(iOException, "e");
        this.nextRouteToTry = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
