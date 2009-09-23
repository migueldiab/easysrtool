package com.sabre.hd.easysr.dao.exceptions;

public class DAORuntimeException extends RuntimeException {
  /*
   *
   * @author
   * @parms
   * @return
   * @changes
   */
	public DAORuntimeException(final Throwable cause) {
		super(cause);
	}

	public DAORuntimeException(final String msg, final Throwable cause) {
		super(msg, cause);
	}

	public DAORuntimeException(final String msg) {
		super(msg);
	}

}