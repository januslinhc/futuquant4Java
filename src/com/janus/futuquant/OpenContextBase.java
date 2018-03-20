package com.janus.futuquant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OpenContextBase {
  private String host;
  private Integer port;
  private Boolean sync_socket_enable;
  private Boolean async_socket_enable;
  private Boolean thread_is_exit;
  private Boolean is_socket_reconnecting;
  private Boolean is_obj_closed;
  private Boolean proc_run;
  private Lock sync_query_lock;
  private Integer count_reconnect;

  // Todo: Unsure type.
  private Object async_ctx;
  private Object sync_net_ctx;
  private Object thread_check_sync_sock;
  private Object check_last_req_time;
  private Object handlers_ctx;

  public OpenContextBase(String host, Integer port, Boolean sync_socket_enable, Boolean async_socket_enable) {
    this.host = host;
    this.port = port;
    this.sync_socket_enable = sync_socket_enable;
    this.async_socket_enable = async_socket_enable;

    this.async_ctx = null;
    this.sync_net_ctx = null;
    this.thread_check_sync_sock = null;
    this.thread_is_exit = false;
    this.check_last_req_time = null;
    this.is_socket_reconnecting = false;
    this.is_obj_closed = false;

    this.sync_query_lock = new ReentrantLock();
    this.count_reconnect = 0;

    if (!this.sync_socket_enable && !this.async_socket_enable)
      throw new Exception("you should specify at least one socket type to create !")
  }

  /**
   * sync_socket & async_socket recreate
   */
  private void socket_reconnect_and_wait_ready() {
    if (this.is_socket_reconnecting || this.is_obj_closed || this.sync_query_lock == null)
      return;
    this.count_reconnect += 1;
    try{
      this.is_socket_reconnecting = true;
      this.sync_query_lock.lock();

      //create async socket (for push data)
      if (this.async_socket_enable) {
        if (this.async_ctx == null) {
          this.handlers_ctx = ;
          this.async_ctx = ;
        } else {

        }
      }
    } finally{

    }
  }
}
