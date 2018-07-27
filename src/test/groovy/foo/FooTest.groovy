package foo 

import spock.lang.Specification

class FooTest extends Specification {

  def 'should create a set' () {
    given:
    def folder = null

    when:
    Set results = []

    then:
    true

    cleanup:
    folder?.deleteDir()
  }

  def 'should create a list' () {
    given:
    def folder = null

    when:
    List results = []

    then:
    true

    cleanup:
    folder?.deleteDir()
  }

}