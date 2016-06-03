package endpoints

import scala.language.higherKinds

trait JsonEntities extends EndpointsAlg {

  type JsonRequest[A]

  def jsonRequest[A : JsonRequest]: RequestEntity[A]


  type JsonResponse[A]

  def jsonResponse[A : JsonResponse]: Response[A]

}