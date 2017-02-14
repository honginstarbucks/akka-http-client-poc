package com.example.rest.routes

import akka.http.scaladsl.server
import akka.http.scaladsl.server.Directives.pathPrefix
import de.heikoseeberger.akkahttpcirce.CirceSupport

trait UserRoute extends CirceSupport {
  val route: server.Route = pathPrefix("users") {

  }
}
