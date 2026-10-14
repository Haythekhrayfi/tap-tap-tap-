package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.YandexMetrica;

/* JADX INFO: loaded from: classes.dex */
public class T3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U3 f15063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CounterConfiguration f15064b;

    /* JADX WARN: Code duplicated, block: B:23:0x0048 A[Catch: all -> 0x00b0, TryCatch #1 {, blocks: (B:11:0x0021, B:13:0x0029, B:14:0x002f, B:16:0x003b, B:19:0x003e, B:20:0x003f, B:21:0x0040, B:23:0x0048, B:24:0x004e, B:26:0x005a, B:29:0x005d, B:30:0x005e, B:31:0x005f, B:33:0x0067, B:34:0x006d, B:40:0x007e, B:43:0x0081, B:44:0x0082, B:45:0x0083, B:47:0x008b, B:49:0x0099, B:50:0x009f, B:52:0x00a7, B:55:0x00aa, B:56:0x00ab, B:35:0x006e, B:39:0x0077, B:51:0x00a0, B:25:0x004f, B:15:0x0030), top: B:66:0x0021, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005f A[Catch: all -> 0x00b0, TryCatch #1 {, blocks: (B:11:0x0021, B:13:0x0029, B:14:0x002f, B:16:0x003b, B:19:0x003e, B:20:0x003f, B:21:0x0040, B:23:0x0048, B:24:0x004e, B:26:0x005a, B:29:0x005d, B:30:0x005e, B:31:0x005f, B:33:0x0067, B:34:0x006d, B:40:0x007e, B:43:0x0081, B:44:0x0082, B:45:0x0083, B:47:0x008b, B:49:0x0099, B:50:0x009f, B:52:0x00a7, B:55:0x00aa, B:56:0x00ab, B:35:0x006e, B:39:0x0077, B:51:0x00a0, B:25:0x004f, B:15:0x0030), top: B:66:0x0021, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[Catch: all -> 0x00b0, TryCatch #1 {, blocks: (B:11:0x0021, B:13:0x0029, B:14:0x002f, B:16:0x003b, B:19:0x003e, B:20:0x003f, B:21:0x0040, B:23:0x0048, B:24:0x004e, B:26:0x005a, B:29:0x005d, B:30:0x005e, B:31:0x005f, B:33:0x0067, B:34:0x006d, B:40:0x007e, B:43:0x0081, B:44:0x0082, B:45:0x0083, B:47:0x008b, B:49:0x0099, B:50:0x009f, B:52:0x00a7, B:55:0x00aa, B:56:0x00ab, B:35:0x006e, B:39:0x0077, B:51:0x00a0, B:25:0x004f, B:15:0x0030), top: B:66:0x0021, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083 A[Catch: all -> 0x00b0, TryCatch #1 {, blocks: (B:11:0x0021, B:13:0x0029, B:14:0x002f, B:16:0x003b, B:19:0x003e, B:20:0x003f, B:21:0x0040, B:23:0x0048, B:24:0x004e, B:26:0x005a, B:29:0x005d, B:30:0x005e, B:31:0x005f, B:33:0x0067, B:34:0x006d, B:40:0x007e, B:43:0x0081, B:44:0x0082, B:45:0x0083, B:47:0x008b, B:49:0x0099, B:50:0x009f, B:52:0x00a7, B:55:0x00aa, B:56:0x00ab, B:35:0x006e, B:39:0x0077, B:51:0x00a0, B:25:0x004f, B:15:0x0030), top: B:66:0x0021, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[Catch: all -> 0x00b0, TryCatch #1 {, blocks: (B:11:0x0021, B:13:0x0029, B:14:0x002f, B:16:0x003b, B:19:0x003e, B:20:0x003f, B:21:0x0040, B:23:0x0048, B:24:0x004e, B:26:0x005a, B:29:0x005d, B:30:0x005e, B:31:0x005f, B:33:0x0067, B:34:0x006d, B:40:0x007e, B:43:0x0081, B:44:0x0082, B:45:0x0083, B:47:0x008b, B:49:0x0099, B:50:0x009f, B:52:0x00a7, B:55:0x00aa, B:56:0x00ab, B:35:0x006e, B:39:0x0077, B:51:0x00a0, B:25:0x004f, B:15:0x0030), top: B:66:0x0021, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public T3(Bundle bundle) {
        String string;
        int i10;
        int i11;
        this.f15063a = U3.a(bundle);
        CounterConfiguration counterConfiguration = null;
        if (bundle != null) {
            try {
                counterConfiguration = (CounterConfiguration) bundle.getParcelable("COUNTER_CFG_OBJ");
            } catch (Throwable unused) {
            }
        }
        counterConfiguration = counterConfiguration == null ? new CounterConfiguration() : counterConfiguration;
        synchronized (counterConfiguration) {
            if (bundle != null) {
                if (bundle.getInt("CFG_DISPATCH_PERIOD") != 0) {
                    int i12 = bundle.getInt("CFG_DISPATCH_PERIOD");
                    synchronized (counterConfiguration) {
                        counterConfiguration.f13444c.put("CFG_DISPATCH_PERIOD", Integer.valueOf(i12));
                        if (bundle.getInt("CFG_SESSION_TIMEOUT") != 0) {
                            i11 = bundle.getInt("CFG_SESSION_TIMEOUT");
                            synchronized (counterConfiguration) {
                                counterConfiguration.f13444c.put("CFG_SESSION_TIMEOUT", Integer.valueOf(i11));
                                if (bundle.getInt("CFG_MAX_REPORTS_COUNT") != 0) {
                                    i10 = bundle.getInt("CFG_MAX_REPORTS_COUNT");
                                    synchronized (counterConfiguration) {
                                        counterConfiguration.f13444c.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(i10 <= 0 ? Integer.MAX_VALUE : i10));
                                        if (bundle.getString("CFG_API_KEY") != null && !"-1".equals(bundle.getString("CFG_API_KEY"))) {
                                            string = bundle.getString("CFG_API_KEY");
                                            synchronized (counterConfiguration) {
                                                counterConfiguration.f13444c.put("CFG_API_KEY", string);
                                            }
                                        }
                                    }
                                } else if (bundle.getString("CFG_API_KEY") != null) {
                                    string = bundle.getString("CFG_API_KEY");
                                    synchronized (counterConfiguration) {
                                        counterConfiguration.f13444c.put("CFG_API_KEY", string);
                                    }
                                }
                            }
                        } else if (bundle.getInt("CFG_MAX_REPORTS_COUNT") != 0) {
                            i10 = bundle.getInt("CFG_MAX_REPORTS_COUNT");
                            synchronized (counterConfiguration) {
                                counterConfiguration.f13444c.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(i10 <= 0 ? Integer.MAX_VALUE : i10));
                                if (bundle.getString("CFG_API_KEY") != null) {
                                    string = bundle.getString("CFG_API_KEY");
                                    synchronized (counterConfiguration) {
                                        counterConfiguration.f13444c.put("CFG_API_KEY", string);
                                    }
                                }
                            }
                        } else if (bundle.getString("CFG_API_KEY") != null) {
                            string = bundle.getString("CFG_API_KEY");
                            synchronized (counterConfiguration) {
                                counterConfiguration.f13444c.put("CFG_API_KEY", string);
                            }
                        }
                    }
                } else if (bundle.getInt("CFG_SESSION_TIMEOUT") != 0) {
                    i11 = bundle.getInt("CFG_SESSION_TIMEOUT");
                    synchronized (counterConfiguration) {
                        counterConfiguration.f13444c.put("CFG_SESSION_TIMEOUT", Integer.valueOf(i11));
                        if (bundle.getInt("CFG_MAX_REPORTS_COUNT") != 0) {
                            i10 = bundle.getInt("CFG_MAX_REPORTS_COUNT");
                            synchronized (counterConfiguration) {
                                counterConfiguration.f13444c.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(i10 <= 0 ? Integer.MAX_VALUE : i10));
                                if (bundle.getString("CFG_API_KEY") != null) {
                                    string = bundle.getString("CFG_API_KEY");
                                    synchronized (counterConfiguration) {
                                        counterConfiguration.f13444c.put("CFG_API_KEY", string);
                                    }
                                }
                            }
                        } else if (bundle.getString("CFG_API_KEY") != null) {
                            string = bundle.getString("CFG_API_KEY");
                            synchronized (counterConfiguration) {
                                counterConfiguration.f13444c.put("CFG_API_KEY", string);
                            }
                        }
                    }
                } else if (bundle.getInt("CFG_MAX_REPORTS_COUNT") != 0) {
                    i10 = bundle.getInt("CFG_MAX_REPORTS_COUNT");
                    synchronized (counterConfiguration) {
                        counterConfiguration.f13444c.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(i10 <= 0 ? Integer.MAX_VALUE : i10));
                        if (bundle.getString("CFG_API_KEY") != null) {
                            string = bundle.getString("CFG_API_KEY");
                            synchronized (counterConfiguration) {
                                counterConfiguration.f13444c.put("CFG_API_KEY", string);
                            }
                        }
                    }
                } else if (bundle.getString("CFG_API_KEY") != null) {
                    string = bundle.getString("CFG_API_KEY");
                    synchronized (counterConfiguration) {
                        counterConfiguration.f13444c.put("CFG_API_KEY", string);
                    }
                }
                this.f15064b = counterConfiguration;
            }
        }
        this.f15064b = counterConfiguration;
    }

    public T3(U3 u10, CounterConfiguration counterConfiguration) {
        this.f15063a = u10;
        this.f15064b = counterConfiguration;
    }

    public static boolean a(T3 t10, Context context) {
        return (t10.f15063a != null && context.getPackageName().equals(t10.f15063a.f()) && t10.f15063a.i() == YandexMetrica.getLibraryApiLevel()) ? false : true;
    }

    public U3 a() {
        return this.f15063a;
    }

    public CounterConfiguration b() {
        return this.f15064b;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ClientConfiguration{mProcessConfiguration=");
        sbA.append(this.f15063a);
        sbA.append(", mCounterConfiguration=");
        sbA.append(this.f15064b);
        sbA.append('}');
        return sbA.toString();
    }
}
