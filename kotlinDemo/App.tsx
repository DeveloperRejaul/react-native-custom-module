import { StyleSheet, Text, View, NativeModules } from 'react-native'
import React, { useEffect } from 'react'
const {demo} = NativeModules;

export default function App() {


  useEffect(()=>{
    demo.play((error, result) => {
      if (error) {
        console.error(error);
      } else {
        console.log(result); 
      }
    });
  },[])
  
  
  return (
    <View>
      <Text>App</Text>
    </View>
  )
}

const styles = StyleSheet.create({})