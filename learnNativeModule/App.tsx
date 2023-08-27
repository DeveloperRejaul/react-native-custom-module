import {Text, View , NativeModules} from 'react-native';
import React from 'react';
const {helloWorld} = NativeModules;


export default function App() {

  const handleOnPress = ()=>{
    helloWorld.sayHello("Rezaul", (error, message)=>{
      if (error) return console.log(error);
      console.log(message);
    });
  };

  return (
    <View style={{flex:1, justifyContent:"center", alignItems:"center"}}>
      <Text onPress={handleOnPress} style={{fontSize:30, color:"black"}}>App</Text>
    </View>
  )
}

