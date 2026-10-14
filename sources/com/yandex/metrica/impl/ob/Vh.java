package com.yandex.metrica.impl.ob;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;

/* JADX INFO: loaded from: classes.dex */
class Vh implements InterfaceC1638fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f15318a;

    public Vh(File file) {
        this.f15318a = file;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1638fi
    public ServerSocket a(int i10) throws IOException, InterfaceC1638fi.a {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            keyStore.load(new FileInputStream(this.f15318a), "`0l}%01ny{jl~;|&".toCharArray());
            keyManagerFactory.init(keyStore, "`0l}%01ny{jl~;|&".toCharArray());
            sSLContext.init(keyManagerFactory.getKeyManagers(), null, null);
            return sSLContext.getServerSocketFactory().createServerSocket(i10);
        } catch (Exception e10) {
            throw new InterfaceC1638fi.a("https_open_error", e10);
        }
    }
}
