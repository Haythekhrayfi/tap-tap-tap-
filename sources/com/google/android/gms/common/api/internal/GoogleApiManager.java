package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import q.c;
import w0.a;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
public class GoogleApiManager implements Handler.Callback {
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status zab = new Status(4, "The user must be signed in to make this API call.");
    private static final Object zac = new Object();

    @GuardedBy("lock")
    private static GoogleApiManager zad;
    private TelemetryData zai;
    private TelemetryLoggingClient zaj;
    private final Context zak;
    private final GoogleApiAvailability zal;
    private final com.google.android.gms.common.internal.zal zam;

    @NotOnlyInitialized
    private final Handler zat;
    private volatile boolean zau;
    private long zae = 5000;
    private long zaf = 120000;
    private long zag = AbstractComponentTracker.LINGERING_TIMEOUT;
    private boolean zah = false;
    private final AtomicInteger zan = new AtomicInteger(1);
    private final AtomicInteger zao = new AtomicInteger(0);
    private final Map<ApiKey<?>, zabq<?>> zap = new ConcurrentHashMap(5, 0.75f, 1);

    @GuardedBy("lock")
    private zaae zaq = null;

    @GuardedBy("lock")
    private final Set<ApiKey<?>> zar = new c();
    private final Set<ApiKey<?>> zas = new c();

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zau = true;
        this.zak = context;
        com.google.android.gms.internal.base.zaq zaqVar = new com.google.android.gms.internal.base.zaq(looper, this);
        this.zat = zaqVar;
        this.zal = googleApiAvailability;
        this.zam = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.zau = false;
        }
        zaqVar.sendMessage(zaqVar.obtainMessage(6));
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (zac) {
            GoogleApiManager googleApiManager = zad;
            if (googleApiManager != null) {
                googleApiManager.zao.incrementAndGet();
                Handler handler = googleApiManager.zat;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status zaH(ApiKey<?> apiKey, ConnectionResult connectionResult) {
        String strZab = apiKey.zab();
        String strValueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, a.a(new StringBuilder(String.valueOf(strZab).length() + 63 + strValueOf.length()), "API: ", strZab, " is not available on this device. Connection failed with: ", strValueOf));
    }

    private final zabq<?> zaI(GoogleApi<?> googleApi) {
        Object apiKey = googleApi.getApiKey();
        zabq<?> zabqVar = this.zap.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new zabq<>(this, googleApi);
            this.zap.put((ApiKey<?>) apiKey, zabqVar);
        }
        if (zabqVar.zaz()) {
            this.zas.add((ApiKey<?>) apiKey);
        }
        zabqVar.zao();
        return zabqVar;
    }

    private final TelemetryLoggingClient zaJ() {
        if (this.zaj == null) {
            this.zaj = TelemetryLogging.getClient(this.zak);
        }
        return this.zaj;
    }

    private final void zaK() {
        TelemetryData telemetryData = this.zai;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zaF()) {
                zaJ().log(telemetryData);
            }
            this.zai = null;
        }
    }

    private final <T> void zaL(TaskCompletionSource<T> taskCompletionSource, int i10, GoogleApi googleApi) {
        zacd zacdVarZaa;
        if (i10 == 0 || (zacdVarZaa = zacd.zaa(this, i10, googleApi.getApiKey())) == null) {
            return;
        }
        Task<T> task = taskCompletionSource.getTask();
        final Handler handler = this.zat;
        Objects.requireNonNull(handler);
        task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.zabk
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, zacdVarZaa);
    }

    public static GoogleApiManager zal() {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            Preconditions.checkNotNull(zad, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    public static GoogleApiManager zam(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            if (zad == null) {
                zad = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.getOrStartHandlerThread().getLooper(), GoogleApiAvailability.getInstance());
            }
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:67:0x0225  */
    /* JADX WARN: Code duplicated, block: B:68:0x0232  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        TaskCompletionSource<Boolean> taskCompletionSourceZab;
        Boolean boolValueOf;
        int i10 = message.what;
        zabq<?> zabqVar = null;
        switch (i10) {
            case 1:
                this.zag = true == ((Boolean) message.obj).booleanValue() ? AbstractComponentTracker.LINGERING_TIMEOUT : 300000L;
                this.zat.removeMessages(12);
                for (ApiKey<?> apiKey : this.zap.keySet()) {
                    Handler handler = this.zat;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey), this.zag);
                }
                return true;
            case 2:
                zal zalVar = (zal) message.obj;
                for (ApiKey<?> apiKey2 : zalVar.zab()) {
                    zabq<?> zabqVar2 = this.zap.get(apiKey2);
                    if (zabqVar2 == null) {
                        zalVar.zac(apiKey2, new ConnectionResult(13), null);
                        return true;
                    }
                    if (zabqVar2.zay()) {
                        zalVar.zac(apiKey2, ConnectionResult.RESULT_SUCCESS, zabqVar2.zaf().getEndpointPackageName());
                    } else {
                        ConnectionResult connectionResultZad = zabqVar2.zad();
                        if (connectionResultZad != null) {
                            zalVar.zac(apiKey2, connectionResultZad, null);
                        } else {
                            zabqVar2.zat(zalVar);
                            zabqVar2.zao();
                        }
                    }
                }
                return true;
            case 3:
                for (zabq<?> zabqVar3 : this.zap.values()) {
                    zabqVar3.zan();
                    zabqVar3.zao();
                }
                return true;
            case 4:
            case 8:
            case 13:
                zach zachVar = (zach) message.obj;
                zabq<?> zabqVarZaI = this.zap.get(zachVar.zac.getApiKey());
                if (zabqVarZaI == null) {
                    zabqVarZaI = zaI(zachVar.zac);
                }
                if (!zabqVarZaI.zaz() || this.zao.get() == zachVar.zab) {
                    zabqVarZaI.zap(zachVar.zaa);
                } else {
                    zachVar.zaa.zad(zaa);
                    zabqVarZaI.zav();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                for (zabq<?> zabqVar4 : this.zap.values()) {
                    if (zabqVar4.zab() == i11) {
                        zabqVar = zabqVar4;
                        if (zabqVar != null) {
                            StringBuilder sb2 = new StringBuilder(76);
                            sb2.append("Could not find API instance ");
                            sb2.append(i11);
                            sb2.append(" while trying to fail enqueued calls.");
                            Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                        } else if (connectionResult.getErrorCode() == 13) {
                            String errorString = this.zal.getErrorString(connectionResult.getErrorCode());
                            String errorMessage = connectionResult.getErrorMessage();
                            zabqVar.zaD(new Status(17, a.a(new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(errorMessage).length()), "Error resolution was canceled by the user, original error message: ", errorString, ": ", errorMessage)));
                        } else {
                            zabqVar.zaD(zaH(((zabq) zabqVar).zad, connectionResult));
                        }
                        return true;
                    }
                }
                if (zabqVar != null) {
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Could not find API instance ");
                    sb3.append(i11);
                    sb3.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb3.toString(), new Exception());
                } else if (connectionResult.getErrorCode() == 13) {
                    String errorString2 = this.zal.getErrorString(connectionResult.getErrorCode());
                    String errorMessage2 = connectionResult.getErrorMessage();
                    zabqVar.zaD(new Status(17, a.a(new StringBuilder(String.valueOf(errorString2).length() + 69 + String.valueOf(errorMessage2).length()), "Error resolution was canceled by the user, original error message: ", errorString2, ": ", errorMessage2)));
                } else {
                    zabqVar.zaD(zaH(((zabq) zabqVar).zad, connectionResult));
                }
                return true;
            case 6:
                if (this.zak.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.zak.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new zabl(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zag = 300000L;
                    }
                }
                return true;
            case 7:
                zaI((GoogleApi) message.obj);
                return true;
            case 9:
                if (this.zap.containsKey(message.obj)) {
                    this.zap.get(message.obj).zau();
                }
                return true;
            case 10:
                Iterator<ApiKey<?>> it = this.zas.iterator();
                while (it.hasNext()) {
                    zabq<?> zabqVarRemove = this.zap.remove(it.next());
                    if (zabqVarRemove != null) {
                        zabqVarRemove.zav();
                    }
                }
                this.zas.clear();
                return true;
            case 11:
                if (this.zap.containsKey(message.obj)) {
                    this.zap.get(message.obj).zaw();
                }
                return true;
            case 12:
                if (this.zap.containsKey(message.obj)) {
                    this.zap.get(message.obj).zaA();
                }
                return true;
            case 14:
                zaaf zaafVar = (zaaf) message.obj;
                ApiKey<?> apiKeyZaa = zaafVar.zaa();
                if (this.zap.containsKey(apiKeyZaa)) {
                    boolean zZaN = this.zap.get(apiKeyZaa).zaN(false);
                    taskCompletionSourceZab = zaafVar.zab();
                    boolValueOf = Boolean.valueOf(zZaN);
                } else {
                    taskCompletionSourceZab = zaafVar.zab();
                    boolValueOf = Boolean.FALSE;
                }
                taskCompletionSourceZab.setResult(boolValueOf);
                return true;
            case 15:
                zabs zabsVar = (zabs) message.obj;
                if (this.zap.containsKey(zabsVar.zaa)) {
                    zabq.zal(this.zap.get(zabsVar.zaa), zabsVar);
                }
                return true;
            case 16:
                zabs zabsVar2 = (zabs) message.obj;
                if (this.zap.containsKey(zabsVar2.zaa)) {
                    zabq.zam(this.zap.get(zabsVar2.zaa), zabsVar2);
                }
                return true;
            case 17:
                zaK();
                return true;
            case 18:
                zace zaceVar = (zace) message.obj;
                if (zaceVar.zac == 0) {
                    zaJ().log(new TelemetryData(zaceVar.zab, Arrays.asList(zaceVar.zaa)));
                } else {
                    TelemetryData telemetryData = this.zai;
                    if (telemetryData != null) {
                        List<MethodInvocation> listZab = telemetryData.zab();
                        if (telemetryData.zaa() != zaceVar.zab || (listZab != null && listZab.size() >= zaceVar.zad)) {
                            this.zat.removeMessages(17);
                            zaK();
                        } else {
                            this.zai.zac(zaceVar.zaa);
                        }
                    }
                    if (this.zai == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zaceVar.zaa);
                        this.zai = new TelemetryData(zaceVar.zab, arrayList);
                        Handler handler2 = this.zat;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zaceVar.zac);
                    }
                }
                return true;
            case 19:
                this.zah = false;
                return true;
            default:
                StringBuilder sb4 = new StringBuilder(31);
                sb4.append("Unknown message id: ");
                sb4.append(i10);
                Log.w("GoogleApiManager", sb4.toString());
                return false;
        }
    }

    public final void zaA() {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaB(GoogleApi<?> googleApi) {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    public final void zaC(zaae zaaeVar) {
        synchronized (zac) {
            if (this.zaq != zaaeVar) {
                this.zaq = zaaeVar;
                this.zar.clear();
            }
            this.zar.addAll(zaaeVar.zaa());
        }
    }

    public final void zaD(zaae zaaeVar) {
        synchronized (zac) {
            if (this.zaq == zaaeVar) {
                this.zaq = null;
                this.zar.clear();
            }
        }
    }

    public final boolean zaF() {
        if (this.zah) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int iZaa = this.zam.zaa(this.zak, 203400000);
        return iZaa == -1 || iZaa == 0;
    }

    public final boolean zaG(ConnectionResult connectionResult, int i10) {
        return this.zal.zah(this.zak, connectionResult, i10);
    }

    public final int zaa() {
        return this.zan.getAndIncrement();
    }

    public final zabq zak(ApiKey<?> apiKey) {
        return this.zap.get(apiKey);
    }

    public final Task<Map<ApiKey<?>, String>> zao(Iterable<? extends HasApiKey<?>> iterable) {
        zal zalVar = new zal(iterable);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(2, zalVar));
        return zalVar.zaa();
    }

    public final Task<Boolean> zap(GoogleApi<?> googleApi) {
        zaaf zaafVar = new zaaf(googleApi.getApiKey());
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(14, zaafVar));
        return zaafVar.zab().getTask();
    }

    public final <O extends Api.ApiOptions> Task<Void> zaq(GoogleApi<O> googleApi, RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaL(taskCompletionSource, registerListenerMethod.zaa(), googleApi);
        zaf zafVar = new zaf(new zaci(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(8, new zach(zafVar, this.zao.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends Api.ApiOptions> Task<Boolean> zar(GoogleApi<O> googleApi, ListenerHolder.ListenerKey listenerKey, int i10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaL(taskCompletionSource, i10, googleApi);
        zah zahVar = new zah(listenerKey, taskCompletionSource);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(13, new zach(zahVar, this.zao.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends Api.ApiOptions> void zaw(GoogleApi<O> googleApi, int i10, BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zae zaeVar = new zae(i10, apiMethodImpl);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(4, new zach(zaeVar, this.zao.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions, ResultT> void zax(GoogleApi<O> googleApi, int i10, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        zaL(taskCompletionSource, taskApiCall.zaa(), googleApi);
        zag zagVar = new zag(i10, taskApiCall, taskCompletionSource, statusExceptionMapper);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(4, new zach(zagVar, this.zao.get(), googleApi)));
    }

    public final void zay(MethodInvocation methodInvocation, int i10, long j10, int i11) {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(18, new zace(methodInvocation, i10, j10, i11)));
    }

    public final void zaz(ConnectionResult connectionResult, int i10) {
        if (zaG(connectionResult, i10)) {
            return;
        }
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
    }
}
