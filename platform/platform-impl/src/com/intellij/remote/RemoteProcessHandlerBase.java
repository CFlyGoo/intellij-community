package com.intellij.remote;

import com.intellij.openapi.util.Pair;
import com.intellij.util.PathMapper;
import com.intellij.util.PathMappingSettings;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author traff
 */
public interface RemoteProcessHandlerBase {
  @NotNull
  PathMapper getMappingSettings();

  /**
   * @deprecated use {@link #getRemoteSocket(int)}
   */
  @Deprecated
  Pair<String, Integer> obtainRemoteSocket() throws RemoteSdkException;

  /**
   * @deprecated use {@link #getRemoteSocket(int)}
   */
  @Deprecated
  void addRemoteForwarding(int remotePort, int localPort);

  Pair<String, Integer> getRemoteSocket(int localPort) throws RemoteSdkException;

  List<PathMappingSettings.PathMapping> getFileMappings();
}
