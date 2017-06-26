package net.smartcosmos.labels.models

import anorm._
import anorm.SqlParser._
import java.sql.Connection
 


object TidVideo {
  
  
  def getVideoForTid(tid:String)(implicit c:Connection) = {
    SQL"""select video_id from tid_video_id where tid = $tid""".as(scalar[Long].single)
  }
  
  def setVideoForTid(tid:String, videoId:Long)(implicit c:Connection) = {
    SQL"""INSERT INTO tid_video_id (tid, video_id) values ($tid, $videoId)
          ON DUPLICATE KEY UPDATE video_id=$videoId
    """.executeInsert()
  }
  
}