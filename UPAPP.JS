import React from "react";

import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

import LoginPage from "./components/LoginPage";

import SignUpPage from "./components/SignUpPage";

import ForgotPasswordPage from "./components/ForgotPasswordPage";

import "./App.css";



function App() {

  return (

    <Router>

      <Routes>

        <Route path="/" element={<LoginPage />} />

        <Route path="/signup" element={<SignUpPage />} />

        <Route path="/forgot-password" element={<ForgotPasswordPage />} />

        {/* Add other protected routes later */}

      </Routes>

    </Router>

  );

}



export default App;
