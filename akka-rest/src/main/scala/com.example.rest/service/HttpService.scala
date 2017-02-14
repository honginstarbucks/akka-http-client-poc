package com.example.rest.service

import akka.http.scaladsl.server
import com.example.rest.routes.UserRoute
import com.example.rest.utils.CorsSupport

trait HttpService extends UserRoute with CorsSupport {
  def allRoutes: server.Route
}

class HttpServiceImpl

