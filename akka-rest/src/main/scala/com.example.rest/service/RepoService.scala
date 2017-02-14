package com.example.rest.service

import com.example.rest.model.User

import scala.concurrent.Future

trait RepoService {
  def saveUser(user: User) : Future[User]
  def getUserByName(name:String): Future[User]
}


