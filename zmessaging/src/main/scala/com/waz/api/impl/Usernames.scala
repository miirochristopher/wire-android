/*
 * Wire
 * Copyright (C) 2016 Wire Swiss GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.waz.api.impl

import com.waz.api
import com.waz.api.{UsernameValidation, UsernamesRequestCallback}

class Usernames extends api.Usernames{
  override def isUsernameAvailable(username: String, callback: UsernamesRequestCallback) = {
    //TODO: STUB
    callback.onUsernameRequestResult("", new UsernameValidation {
      override def isValid: Boolean = true
      override def reason: String = ""
    })
  }
  override def isUsernameValid(username: String): UsernameValidation = {
    //TODO: STUB
    new UsernameValidation {
      override def isValid: Boolean = true
      override def reason: String = ""
    }
  }
}
