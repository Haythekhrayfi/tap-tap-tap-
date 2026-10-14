package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface bw extends IInterface {
    void a() throws RemoteException;

    void a(int i10) throws RemoteException;

    void a(int i10, Bundle bundle) throws RemoteException;

    void a(Bundle bundle) throws RemoteException;

    void a(List<Bundle> list) throws RemoteException;

    void b() throws RemoteException;

    void b(int i10, Bundle bundle) throws RemoteException;

    void b(Bundle bundle) throws RemoteException;

    void c(int i10, Bundle bundle) throws RemoteException;

    void c(Bundle bundle) throws RemoteException;

    void d(Bundle bundle) throws RemoteException;

    void e(Bundle bundle) throws RemoteException;
}
